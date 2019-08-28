package commonutils;

import io.restassured.response.Response;

import java.io.BufferedReader;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

public class APIUtils {


    public void assertSuccessStatus(Response response) {

        response.then().assertThat().statusCode(200);
        System.out.println("OK 200 statuscode");
    }

    public Response postRequest(String request, String header, String apit, String payLoad, String contentType) {
        Response response = given().header(header, apit).contentType(contentType).body(payLoad).when().post(request);

        return response;

    }

    public Response getRequest(String request, String header, String key,String contentType) {

        try {
            Response response = given().header(header, key).contentType(contentType).when()
                    .get(request);
            if (null != response) {
                System.out.println("---Successfully Received the response ---");

            } else {
                System.out.println("--- Response retrieved as NULL ---");

            }

            return response;
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
            return null;
        }
    }

    public String readSimpleJsonFile(String filepath) {

        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        String str = "";
        try {
            br = new BufferedReader(new FileReader(filepath));
            while (null != (str = br.readLine())) {

                sb.append(str);
            }
        } catch (Exception e) {
            String exceptionData = e.getCause().getMessage();
            System.out.println("Encountered during reading catalog json file : " + exceptionData);

        }

        return sb.toString();
    }
}
