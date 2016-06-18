package es.panel.cientouno.manager.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Test;

public class PropertiesLoaderTest {
	
	private static final Logger LOG = Logger.getLogger(PropertiesLoaderTest.class);
	
	@Test
	public void leerPropiedadesAplicacionPorDefecto(){
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
			

			// WHEN (TEST)
			PropertiesLoader pl = new PropertiesLoader();
			Properties properties = pl.getProperties();
			
			// THEN (ACCEPT CRITERIA = business rule)
			assertNotNull("No se ha cargado el archivo de properties", properties);
			String key = "webservice.agenciatributaria.endpoint";
			assertEquals("Propiedad no encontrada " + key, "http://localhost:8089/mockAgenciaTributariaServiceSOAP?wsdl", properties.get(key));
			key = "webservice.padron.endpoint";
			assertEquals("Propiedad no encontrada " + key, "http://localhost:8088/mockPadronServiceSOAP?wsdl", properties.get(key));
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
