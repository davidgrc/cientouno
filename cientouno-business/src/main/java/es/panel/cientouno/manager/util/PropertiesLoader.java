package es.panel.cientouno.manager.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;


public class PropertiesLoader {
	
	private static final Logger LOG = Logger.getLogger(PropertiesLoader.class);
	
	private static Properties properties;
	/**
	 * DEFAULT_RESOURCE
	 */
	private static final String DEFAULT_RESOURCE = "/cientouno.properties";

	
	/**
	 * Constructor of PropertiesLoader
	 *
	 */
	public PropertiesLoader(){
		super();
	}
	
	public Properties getProperties(){
		if(properties == null){
			synchronized(this){
				if(properties == null){
					
					String propertiesFilePath = "";
			    	try {
			    		LOG.info("Loading properties file...");
			    		LOG.debug("Check environment settings. Lookup: catalina.home");
			    		
			    	    String catalinaHome = (String) System.getProperty("catalina.base");
			    	    LOG.debug("catalina.home=" + catalinaHome);
			    	    
			    	    File f = new File(catalinaHome + File.separator + "conf" + File.separator + "cientouno" + File.separator + "cientouno.properties");
			    	    propertiesFilePath = f.getAbsolutePath();
			    	    
			    	    // Load properties from file
			    	    FileInputStream file = new FileInputStream(propertiesFilePath);
			    	    PropertiesLoader.properties = new Properties();
			    	    PropertiesLoader.properties.load(file);
			    	    LOG.info("Done. Loaded log4j properties file from " + propertiesFilePath);
					}
			    	catch (FileNotFoundException e) {
			    		//logger.warn(e.getMessage(), e);
			    		LOG.warn("File not found: " + propertiesFilePath);
			    		PropertiesLoader.properties = loadPropertiesFromClasspath();
					}
			    	catch (IOException e) {
			    		LOG.warn("Error while loading log4j properties file. Path: [" + propertiesFilePath + "] - " + e.getMessage());
			    		PropertiesLoader.properties = loadPropertiesFromClasspath();
					}
				}
			}
		}
		
		return properties;
	}
	
	private Properties loadPropertiesFromClasspath() {
		LOG.warn("Loading the default properties file from classpath");
		Properties properties = null;
		
		try{
			Resource resource = new ClassPathResource(PropertiesLoader.DEFAULT_RESOURCE);
			properties = PropertiesLoaderUtils.loadProperties(resource);
			
			LOG.warn("Done. Default properties file loaded from classpath: " + PropertiesLoader.DEFAULT_RESOURCE);
		}
		catch (IOException ioe) {
			LOG.fatal("Error while loading log4j properties file. " + ioe.getMessage());
			LOG.fatal(ioe.getMessage(), ioe);
			throw new RuntimeException(ioe);
		}
		
		return properties;
	}


}
