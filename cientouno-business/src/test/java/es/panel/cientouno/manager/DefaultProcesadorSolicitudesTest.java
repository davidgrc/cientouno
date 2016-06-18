package es.panel.cientouno.manager;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;

import es.panel.cientouno.manager.exception.ConsultaAgenciaTributariaNoAutorizadaException;
import es.panel.cientouno.manager.exception.ConsultaPadronNoAutorizadaException;
import es.panel.cientouno.manager.model.SolicitudTipoCientouno;

public class DefaultProcesadorSolicitudesTest {
	
	private static final Logger LOG = Logger.getLogger(DefaultProcesadorSolicitudesTest.class);
	
	@Test(expected=ConsultaAgenciaTributariaNoAutorizadaException.class)
	public void alerta_cuando_solicitante_no_autoriza_consulta_agencia_tributaria() throws Exception {
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
            SolicitudTipoCientouno stc = new SolicitudTipoCientouno();
            stc.setDocumento("11111111H");
            stc.setNombre("David");
            stc.setPrimerApellido("G");
            stc.setSegundoApellido("R");
            stc.setAutorizaConsultaAgenciaTributaria(false);
            stc.setAutorizaConsultaPadron(true);
            stc.setEchoToken(UUID.randomUUID().toString());
            
            LOG.debug("input - " + stc.toString());

			
			// WHEN (TEST)
            ProcesadorSolicitudes ps = new DefaultProcesadorSolicitudes();
            ps.solicitud(stc);
			
			// THEN (ACCEPT CRITERIA = business rule)
			// expected exception
		}
		catch(Exception e){
			if(!(e instanceof ConsultaAgenciaTributariaNoAutorizadaException)){
				LOG.error(e.getMessage(), e);
			}
			
			throw e;
		}
		catch(AssertionError e){
			LOG.info("FAILED - " + e.getMessage());
			throw e;
		}
		finally{
			LOG.info("***** TEST (end): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
		}
	}
	
	
	@Test(expected=ConsultaPadronNoAutorizadaException.class)
	public void alerta_cuando_solicitante_no_autoriza_consulta_padron() throws Exception {
		try{
			LOG.info("***** TEST (begin): "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " *****");
			
			// GIVEN (INPUT)
            SolicitudTipoCientouno stc = new SolicitudTipoCientouno();
            stc.setDocumento("11111111H");
            stc.setNombre("David");
            stc.setPrimerApellido("G");
            stc.setSegundoApellido("R");
            stc.setAutorizaConsultaAgenciaTributaria(true);
            stc.setAutorizaConsultaPadron(false);
            stc.setEchoToken(UUID.randomUUID().toString());
            
            LOG.debug("input - " + stc.toString());

			
			// WHEN (TEST)
            ProcesadorSolicitudes ps = new DefaultProcesadorSolicitudes();
            ps.solicitud(stc);
			
			// THEN (ACCEPT CRITERIA = business rule)
			// expected exception
		}
		catch(Exception e){
			if(!(e instanceof ConsultaPadronNoAutorizadaException)){
				LOG.error(e.getMessage(), e);
			}
			
			throw e;
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
