/*
* File: PadronServiceClient.java
* Author: david.garcia
* Date: 24/4/2016
*/
package es.panel.cientouno.wsclient.padron;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

/**
 * Description: Cliente de servcio web creado con una factoria de CXF
 *
 * @date 24/4/2016
 * @author david.garcia
 *
 */
public class PadronServiceClient implements PadronService {
	
	/**
	 * stub
	 */
	private PadronService stub;
	/**
	 * CONTENT_TYPE
	 */
	private static final String CONTENT_TYPE = "text/xml;charset=utf-8";
	
	/**
	 * Constructor of PadronServiceClient
	 *
	 * @param endpoint
	 */
	public PadronServiceClient(final String endpoint){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        
        // interceptors
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        
        // service & endpoint
        factory.setServiceClass(PadronService.class);
        //mock service
        factory.setAddress(endpoint);
        
        this.stub = (PadronService) factory.create();
        
        // set content type 
        Client myClient = org.apache.cxf.frontend.ClientProxy.getClient(this.stub); 
        HTTPConduit http = (HTTPConduit) myClient.getConduit(); 
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy(); 
        httpClientPolicy.setContentType(PadronServiceClient.CONTENT_TYPE); 
        http.setClient(httpClientPolicy); 
	}

	@Override
	public ConsultaPadronResponse consultaPadron(ConsultaPadron parameters) {
		return stub.consultaPadron(parameters);
	}

}
