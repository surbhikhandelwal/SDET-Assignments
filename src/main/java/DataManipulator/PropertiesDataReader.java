package DataManipulator;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDataReader {

    public static Properties loadProperties(String path) {

        try {
            InputStream input = new FileInputStream(path);

            Properties prop = new Properties();
            prop.load(input);
            return prop;


        } catch (
                Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public String getPropertiesData(Properties properties, String key) {
        return properties.getProperty(key);

    }


}
