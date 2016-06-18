package es.panel.cientouno.wsclient.padron;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.junit.Test;

public class PadronServiceIT {
	
	private static final Logger LOG = Logger.getLogger(PadronServiceIT.class);
	
	private static final String URLSTR = "http://localhost:8088/mockPadronServiceSOAP?wsdl";
    private static final QName SERVICE_NAME = new QName("http://www.example.org/PadronService/", "PadronService");
	
	//@Test
	public void consultaPadronClienteJaxWs(){
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
			LOG.debug("input - URL: " + URLSTR);

			// WHEN (TEST)
			URL wsdlURL = new URL(URLSTR);
	        PadronService_Service ss = new PadronService_Service(wsdlURL, SERVICE_NAME);
	        PadronService port = ss.getPadronServiceSOAP();  
	        
	        ConsultaPadron consulta = new ConsultaPadron();
	        consulta.setDocumento("11111111H");
	        consulta.setNombre("David");
	        consulta.setPrimerApellido("Garcia");
	        
	        ConsultaPadronResponse response = port.consultaPadron(consulta);
			
			// THEN (ACCEPT CRITERIA = business rule)
	        assertNotNull("No se ha recibido respuesta", response);
	        assertNotNull("Mensaje incorrecto", response.getSuccess());
	        assertNotNull("El mensaje no contiene el domicilio", response.getDomicilio());
	        assertEquals("Municipio incorrecto", "MADRID", response.getDomicilio().getMunicipio());
	        assertEquals("Vía incorrecta", "Mayor", response.getDomicilio().getVia());
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
	public void consultaPadronClienteCxf(){
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
			LOG.debug("input - URL: " + URLSTR);

			// WHEN (TEST)
			PadronServiceClient port = new PadronServiceClient(URLSTR);
			
	        ConsultaPadron consulta = new ConsultaPadron();
	        consulta.setDocumento("11111111H");
	        consulta.setNombre("David");
	        consulta.setPrimerApellido("Garcia");
	        
	        ConsultaPadronResponse response = port.consultaPadron(consulta);
			
			// THEN (ACCEPT CRITERIA = business rule)
	        assertNotNull("No se ha recibido respuesta", response);
	        assertNotNull("Mensaje incorrecto", response.getSuccess());
	        assertNotNull("El mensaje no contiene el domicilio", response.getDomicilio());
	        assertEquals("Municipio incorrecto", "MADRID", response.getDomicilio().getMunicipio());
	        assertEquals("Vía incorrecta", "Mayor", response.getDomicilio().getVia());
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
