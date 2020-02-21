package managers;

import dataProviders.ConfigFileReader;
import dataProviders.JsonDataReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jsonDataReader;
	private static UtilitiesManager utilitiesManager;
	
	private FileReaderManager() {
	}
	
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
	 
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	 }
	 
	 public JsonDataReader getJsonReader(){
		 return (jsonDataReader == null) ? jsonDataReader = new JsonDataReader() : jsonDataReader;
	}
	 
	 public UtilitiesManager getUtilitiesManager(){
		 return (utilitiesManager == null) ? utilitiesManager = new UtilitiesManager() : utilitiesManager;
	}
}