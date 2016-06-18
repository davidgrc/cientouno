package es.panel.cientouno.wsclient.agenciatributaria;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.junit.Test;

public class AgenciaTributariaServiceIT {
	
	private static final Logger LOG = Logger.getLogger(AgenciaTributariaServiceIT.class);
	
	private static final String URLSTR = "http://localhost:8089/mockAgenciaTributariaServiceSOAP?wsdl";
//	private static final String URLSTR = "http://192.168.4.60/cientounomock/mockAgenciaTributariaServiceSOAP?wsdl";
//	private static final String URLSTR = "http://srv-bookassist/cientounomock/mockAgenciaTributariaServiceSOAP?wsdl";
//	private static final String URLSTR = "http://localhost:8080/cientounomock/mockAgenciaTributariaServiceSOAP?wsdl";
//	private static final String URLSTR = "http://localhost:8080/cientouno-mockservice-0.0.1-SNAPSHOT/mockAgenciaTributariaServiceSOAP?wsdl";
	
	
	
    private static final QName SERVICE_NAME = new QName("http://www.example.org/AgenciaTributariaService/", "AgenciaTributariaService");
    
    //@Test
    public void consultaAgenciaTributariaClienteJaxWs(){
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
			LOG.debug("input - URL: " + URLSTR);

			// WHEN (TEST)
			URL wsdlURL = new URL(URLSTR);
	        AgenciaTributariaService_Service ss = new AgenciaTributariaService_Service(wsdlURL, SERVICE_NAME);
	        AgenciaTributariaService port = ss.getAgenciaTributariaServiceSOAP();
	        
	        ConsultaIrpf consulta = new ConsultaIrpf();
	        consulta.setDocumento("11111111H");
	        consulta.setNombre("David");
	        consulta.setPrimerApellido("Garcia");
	        
	        ConsultaIrpfResponse response = port.consultaIrpf(consulta);
			
			// THEN (ACCEPT CRITERIA = business rule)
	        assertNotNull("No se ha recibido respuesta", response);
	        assertNotNull("Mensaje incorrecto", response.getSuccess());
	        assertNotNull("No hay información de IRPF", response.getIrpf());
	        assertTrue("Rendimiento del trabajo incorrecto", response.getIrpf().getRendimientoTrabajo()==35000);
		}
		catch(Exception e){
			LOG.error("ERROR", e);
			throw new AssertionError(e);
		}
		catch(AssertionError e){
			LOG.info("FAILED - " + e.getMessage());
			throw e;
		}
		finally{
			LOG.info("***** TEST (end): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
		}
    }
    
    
    @Test
    public void consultaAgenciaTributariaClienteCxf(){
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
			LOG.debug("input - URL: " + URLSTR);

			// WHEN (TEST)
			URL wsdlURL = new URL(URLSTR);
	        AgenciaTributariaServiceClient port = new AgenciaTributariaServiceClient(URLSTR);
	        
	        ConsultaIrpf consulta = new ConsultaIrpf();
	        consulta.setDocumento("11111111H");
	        consulta.setNombre("David");
	        consulta.setPrimerApellido("Garcia");
	        
	        ConsultaIrpfResponse response = port.consultaIrpf(consulta);
			
			// THEN (ACCEPT CRITERIA = business rule)
	        assertNotNull("No se ha recibido respuesta", response);
	        assertNotNull("Mensaje incorrecto", response.getSuccess());
	        assertNotNull("No hay información de IRPF", response.getIrpf());
	        assertTrue("Rendimiento del trabajo incorrecto", response.getIrpf().getRendimientoTrabajo()==35000);
		}
		catch(Exception e){
			LOG.error("ERROR", e);
			throw new AssertionError(e);
		}
		catch(AssertionError e){
			LOG.info("FAILED - " + e.getMessage());
			throw e;
		}
		finally{
			LOG.info("***** TEST (end): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
		}
    }



}
