
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package es.panel.cientouno.service;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.apache.log4j.Logger;

import es.panel.cientouno.manager.DefaultProcesadorSolicitudes;
import es.panel.cientouno.manager.ProcesadorSolicitudes;
import es.panel.cientouno.manager.exception.ConsultaAgenciaTributariaNoAutorizadaException;
import es.panel.cientouno.manager.exception.ConsultaPadronNoAutorizadaException;
import es.panel.cientouno.manager.model.ResguardoTipoCientouno;
import es.panel.cientouno.manager.model.SolicitudTipoCientouno;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2016-04-23T00:24:13.578+02:00
 * Generated source version: 3.0.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "solicitud-cientouno",
                      portName = "solicitud-cientounoSOAP",
                      targetNamespace = "http://panel.es/solicitud-cientouno/",
                      wsdlLocation = "solicitud-cientouno.wsdl",
                      endpointInterface = "es.panel.cientouno.service.SolicitudCientouno")
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
public class SolicitudCientounoSOAPImpl implements SolicitudCientouno {

    private static final Logger LOG = Logger.getLogger(SolicitudCientounoSOAPImpl.class.getName());
    
    
    /* (non-Javadoc)
     * @see es.panel.cientouno.service.SolicitudCientouno#cientouno(es.panel.cientouno.service.Cientouno  parameters )*
     */
    public es.panel.cientouno.service.CientounoResponse cientouno(Cientouno parameters) { 
        LOG.info("Executing operation cientouno");
        //System.out.println(parameters);
        try {
            ProcesadorSolicitudes manager = new DefaultProcesadorSolicitudes();
            
            SolicitudTipoCientouno stc = new SolicitudTipoCientouno();
            stc.setDocumento(parameters.getDocumento());
            stc.setNombre(parameters.getNombre());
            stc.setPrimerApellido(parameters.getPrimerApellido());
            stc.setSegundoApellido(parameters.getSegundoApellido());
            stc.setAutorizaConsultaAgenciaTributaria(parameters.isAutorizaConsultaAgenciaTributaria());
            stc.setAutorizaConsultaPadron(parameters.isAutorizaConsultaPadron());
            stc.setEchoToken(parameters.getEchoToken());
            
            ResguardoTipoCientouno resultado = manager.solicitud(stc);
            ResguardoType resguardo = new ResguardoType();
            resguardo.setNumeroRegistro(resultado.getNumeroRegistro());
            resguardo.setInformacionAdicional(resultado.getInformacionAdicional());
            resguardo.setResultado(resultado.getResultado().toString());
            
            SuccessType success = new SuccessType();
            
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            
            CientounoResponse response = new CientounoResponse();
            response.setTimeStamp(currentDate());
            response.setEchoToken(parameters.getEchoToken());
            response.setSuccess(success);
            response.setResguardo(resguardo);
            
            return response;
        }
        catch (ConsultaAgenciaTributariaNoAutorizadaException | ConsultaPadronNoAutorizadaException e){
        	LOG.info(e.getMessage(), e);
        	
        	CientounoResponse response = new CientounoResponse();
        	response.setTimeStamp(currentDate());
        	SuccessType success = new SuccessType();
        	WarningsType warnings = new WarningsType();
        	WarningType warning = new WarningType();
        	warning.setCode("1001");
        	warning.setText("El solicitante no ha autorizado la consulta de datos personales a los servicios de las Administraciones Públicas");
        	warnings.setWarning(warning);
        	
        	response.setSuccess(success);
        	response.setWarnings(warnings);
        	response.setEchoToken(parameters.getEchoToken());
        	return response;
        }
        catch (Exception e) {
        	LOG.error(e.getMessage(), e);
        	
        	CientounoResponse response = new CientounoResponse();
        	ErrorsType errors = new ErrorsType();
        	ErrorType error = new ErrorType();
        	error.setCode("500");
        	error.setText("Error al procesar la solicitud - " + e.getMessage());
        	response.setErrors(errors);
        	response.setEchoToken(parameters.getEchoToken());
        	response.setTimeStamp(currentDate());
        	
        	return response;
        }
    }
    
    private XMLGregorianCalendar currentDate() {
    	XMLGregorianCalendar now = null;
    	
		try {
	        GregorianCalendar gregorianCalendar = new GregorianCalendar();
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
	        now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		}
		catch (DatatypeConfigurationException e) {
			LOG.warn("Error al obtener la hora actual", e);
		}
        
        return now;
    }

}
