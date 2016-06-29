package es.panel.cientouno.manager;

import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import es.panel.cientouno.manager.exception.ConsultaAgenciaTributariaNoAutorizadaException;
import es.panel.cientouno.manager.exception.ConsultaPadronNoAutorizadaException;
import es.panel.cientouno.manager.exception.InternalErrorException;
import es.panel.cientouno.manager.model.ResguardoTipoCientouno;
import es.panel.cientouno.manager.model.Resultado;
import es.panel.cientouno.manager.model.SolicitudTipoCientouno;
import es.panel.cientouno.manager.util.PropertiesLoader;
import es.panel.cientouno.wsclient.agenciatributaria.AgenciaTributariaServiceClient;
import es.panel.cientouno.wsclient.agenciatributaria.ConsultaIrpf;
import es.panel.cientouno.wsclient.agenciatributaria.ConsultaIrpfResponse;
import es.panel.cientouno.wsclient.padron.ConsultaPadron;
import es.panel.cientouno.wsclient.padron.ConsultaPadronResponse;
import es.panel.cientouno.wsclient.padron.PadronServiceClient;

public class DefaultProcesadorSolicitudes implements ProcesadorSolicitudes {
	
	private static final Logger LOG = Logger.getLogger(DefaultProcesadorSolicitudes.class.getName());
	private Properties properties;
	private static final String MUNICIPIO = "MADRID";
	private static final double LIMITE_INGRESOS = 39999;
	
	public DefaultProcesadorSolicitudes(){
		PropertiesLoader pl = new PropertiesLoader();
		this.properties = pl.getProperties();
	}

	@Override
	public ResguardoTipoCientouno solicitud(SolicitudTipoCientouno solicitud) throws InternalErrorException, ConsultaAgenciaTributariaNoAutorizadaException, ConsultaPadronNoAutorizadaException {
		ResguardoTipoCientouno resguardo = null;
		
		try {
			//TODO [003] Descomentar
//			if(!solicitud.isAutorizaConsultaAgenciaTributaria()){
//				throw new ConsultaAgenciaTributariaNoAutorizadaException( "No es posible realizar la solicitud, el usuario no autoriza la consulta a la Agencia Tributaria", new Integer(1000));
//			}
//			if(!solicitud.isAutorizaConsultaPadron()){
//				throw new ConsultaPadronNoAutorizadaException( "No es posible realizar la solicitud, el usuario no autoriza la consulta al Padrón", new Integer(1000));
//			}
			
			resguardo = new ResguardoTipoCientouno();
			resguardo.setNumeroRegistro(UUID.randomUUID().toString());
			
			ConsultaPadronResponse padron = this.consultaPadron(solicitud);
			
			//TODO [002] Descomentar
//			if(!padron.getDomicilio().getMunicipio().equals(MUNICIPIO)){
//				resguardo.setResultado(Resultado.DENEGADO);
//				resguardo.setInformacionAdicional("El solicitante no reside en el municipio de " + MUNICIPIO);
//			}
//			else{
//				ConsultaIrpfResponse irpf = this.consultaAgenciaTributaria(solicitud);
//				double rendimientoTrabajo = Double.valueOf(irpf.getIrpf().getRendimientoTrabajo());
//				double rendimientoMobiliario = Double.valueOf(irpf.getIrpf().getRendimientoCapitalMobiliario());
//				double rendimientoInmobiliario = Double.valueOf(irpf.getIrpf().getRendimientoCapitalInmobiliario());
//				
//				if((rendimientoTrabajo + rendimientoMobiliario + rendimientoInmobiliario)>LIMITE_INGRESOS){
//					resguardo.setResultado(Resultado.DENEGADO);
//					resguardo.setInformacionAdicional("El solicitante tiene unos ingresos declardos superiores a " + LIMITE_INGRESOS + " euros.");
//				}
//				else {
//					resguardo.setResultado(Resultado.CONCEDIDO);
//				}
//			}
			
			//TODO [001] Descomentar
			//TODO [002] Eliminar bloque
			if(!padron.getDomicilio().getMunicipio().equals(MUNICIPIO)){
				resguardo.setResultado(Resultado.DENEGADO);
				resguardo.setInformacionAdicional("El solicitante no reside en el municipio de " + MUNICIPIO);
			}
			else{
				resguardo.setResultado(Resultado.CONCEDIDO);
			}
			
			
		} 
		catch (DatatypeConfigurationException e) {
			throw new InternalErrorException("Error al procesar la soliciud", e, new Integer(500));
		}
		
		return resguardo;
	}
	
	
	/**
	 * consultaAgenciaTributaria
	 * Description:
	 *
	 * @param solicitud
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	private ConsultaIrpfResponse consultaAgenciaTributaria(final SolicitudTipoCientouno solicitud) throws DatatypeConfigurationException{
        ConsultaIrpf request = new ConsultaIrpf();
        request.setDocumento(solicitud.getDocumento());
        request.setNombre(solicitud.getNombre());
        request.setPrimerApellido(solicitud.getPrimerApellido());
        request.setSegundoApellido(solicitud.getSegundoApellido());
        request.setEchoToken(solicitud.getEchoToken());
        
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        
        request.setTimeStamp(now.toXMLFormat());
        
        String endpoint = properties.getProperty("webservice.agenciatributaria.endpoint");
        AgenciaTributariaServiceClient stub = new AgenciaTributariaServiceClient(endpoint);
        return stub.consultaIrpf(request);
	}
	
	/**
	 * consultaPadron
	 * Description:
	 *
	 * @param solicitud
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	private ConsultaPadronResponse consultaPadron(final SolicitudTipoCientouno solicitud) throws DatatypeConfigurationException{
		ConsultaPadron request = new ConsultaPadron();
		request.setDocumento(solicitud.getDocumento());
		request.setNombre(solicitud.getNombre());
		request.setPrimerApellido(solicitud.getPrimerApellido());
		request.setSegundoApellido(solicitud.getSegundoApellido());
		request.setEchoToken(solicitud.getEchoToken());
        
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        
        request.setTimeStamp(now.toXMLFormat());
        
        String endpoint = properties.getProperty("webservice.padron.endpoint");
        PadronServiceClient stub = new PadronServiceClient(endpoint);
        return stub.consultaPadron(request);
	}

}
