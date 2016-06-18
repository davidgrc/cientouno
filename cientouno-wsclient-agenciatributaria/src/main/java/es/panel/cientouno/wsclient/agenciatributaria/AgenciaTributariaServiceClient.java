/*
* File: AgenciaTributariaServiceClient.java
* Author: david.garcia
* Date: 24/4/2016
*/
package es.panel.cientouno.wsclient.agenciatributaria;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;


/**
 * Description: Cliente CXF del servicio Agencia Tributaria
 *
 * @date 24/4/2016
 * @author david.garcia
 *
 */
public class AgenciaTributariaServiceClient implements AgenciaTributariaService {
	
	/**
	 * stub
	 */
	private AgenciaTributariaService stub;
	/**
	 * CONTENT_TYPE
	 */
	private static final String CONTENT_TYPE = "text/xml;charset=utf-8";
	
	
	public AgenciaTributariaServiceClient(final String endpoint) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        
        // interceptors
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        
        // service & endpoint
        factory.setServiceClass(AgenciaTributariaService.class);
        //mock service
        factory.setAddress(endpoint);
        
        this.stub = (AgenciaTributariaService) factory.create();
        
        // set content type 
        Client myClient = org.apache.cxf.frontend.ClientProxy.getClient(this.stub); 
        HTTPConduit http = (HTTPConduit) myClient.getConduit(); 
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy(); 
        httpClientPolicy.setContentType(AgenciaTributariaServiceClient.CONTENT_TYPE); 
        http.setClient(httpClientPolicy); 
	}
	
	
	@Override
	public ConsultaIrpfResponse consultaIrpf(ConsultaIrpf parameters) {
		return stub.consultaIrpf(parameters);
	}
	
}
