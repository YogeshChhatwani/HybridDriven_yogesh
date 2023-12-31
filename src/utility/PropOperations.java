package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropOperations {
	private Properties prop;

	public PropOperations(String filepath) {
		File file = new File(filepath);

		try {
			FileInputStream inputstream = new FileInputStream(file);
			prop = new Properties();
			prop.load(inputstream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getValue(String key) {
		return prop.getProperty(key);
	}

}
