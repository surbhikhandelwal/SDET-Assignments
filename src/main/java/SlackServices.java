import commonutils.APIUtils;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static io.restassured.RestAssured.given;

public class SlackServices extends APIUtils {

    public Response createChannel(String url, String header, String headerVal, String filepath){
        Response response=postRequest(url,header,headerVal,readSimpleJsonFile(filepath),"application/json");
        return response;

    }

    public Response channelList(String url, String header, String headerVal){
        Response response=getRequest(url,header,headerVal,"application/json");
        return response;

    }

    public void validateChannelArchived(ArrayList<HashMap<String, Object>> fieldResponse, String id){
        boolean archived=false;
        for (HashMap<String, Object> entry : fieldResponse) {
            Iterator myVeryOwnIterator = entry.keySet().iterator();
            boolean flag1=false;
            boolean flag2=false;
            while(myVeryOwnIterator.hasNext()) {
                String key=(String)myVeryOwnIterator.next();
                Object value=entry.get(key);
                if(key.equals("id")&&value.equals(id)){
                    flag1=true;
                }
                if(key.equals("is_archived") && value.equals(true)){
                    flag2=true;
                }
            }
            if(flag1 & flag2){
                System.out.println("Channel has been archived");
                archived=true;
                break;
            }

        }
        if(!(archived)){
            System.out.println("Channel has not been archived");
        }

    }



}
