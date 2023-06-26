package utility;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	private static Properties properties;
	private final String propertyFilePath = "src\\test\\resources\\configs\\configuration.properties";

	public TestBase() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}
	
	public long getExplicitWait() {
		String explicitWait = properties.getProperty("explicitWait");
		if (explicitWait != null)
			return Long.parseLong(explicitWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public long getpageLoadTimeout() {
		String pageLoadTimeout = properties.getProperty("pageLoadTimeout");
		if (pageLoadTimeout != null)
			return Long.parseLong(pageLoadTimeout);
		else
			throw new RuntimeException("pageLoadTimeout not specified in the Configuration.properties file.");
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public static String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
		public static String getResourcePath(String path) {
	        String basePath = System.getProperty("user.dir");
	        System.out.println(basePath +"/"+ path);
			return basePath +"/"+ path;
		}

}
