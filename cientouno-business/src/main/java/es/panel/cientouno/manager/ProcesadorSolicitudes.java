package es.panel.cientouno.manager;

import es.panel.cientouno.manager.exception.ConsultaAgenciaTributariaNoAutorizadaException;
import es.panel.cientouno.manager.exception.ConsultaPadronNoAutorizadaException;
import es.panel.cientouno.manager.exception.InternalErrorException;
import es.panel.cientouno.manager.model.ResguardoTipoCientouno;
import es.panel.cientouno.manager.model.SolicitudTipoCientouno;

public interface ProcesadorSolicitudes {
	
	public ResguardoTipoCientouno solicitud(SolicitudTipoCientouno input) throws InternalErrorException, ConsultaAgenciaTributariaNoAutorizadaException, ConsultaPadronNoAutorizadaException;

}
