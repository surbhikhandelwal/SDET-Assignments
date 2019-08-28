import DataManipulator.PropertiesDataReader;
import commonutils.APIUtils;
import io.restassured.response.Response;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class BaseSetup {


    public APIUtils apiUtils = new APIUtils();

    public String doSetUp(String name) {
        Properties prop = PropertiesDataReader.loadProperties("/Users/Surbhi/Downloads/cyborgaltair-master/SlackAPI/configurator.properties");
        return prop.getProperty(name);
    }


}

