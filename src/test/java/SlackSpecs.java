import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class SlackSpecs extends BaseTest{
    Response response;
    SoftAssert softAssert;

    @Test(priority = 1)
    public void createChannel() throws Exception {
        System.out.println("Create a new channel");
        response = slackServices.createChannel(doSetUp("url") + SlackEndpoints.CREATECHANNEL, "Authorization",doSetUp("token"), SlackEndpoints.CREATE_CHANNEL_REQ);
        slackServices.assertSuccessStatus(response);
        System.out.println(response.body().asString());


    }

    @Test(priority = 2)
    public void joinChannel() throws Exception {
        System.out.println("Join a new channel");
        response = slackServices.createChannel(doSetUp("url") + SlackEndpoints.JOINCHANNEL, "Authorization",doSetUp("token"), SlackEndpoints.JOIN_CHANNEL_REQ);
        slackServices.assertSuccessStatus(response);
        System.out.println(response.body().asString());


    }

    @Test(priority = 3)
    public void renameChannel() throws Exception {
        System.out.println("Renaming a channel name");
        response = slackServices.createChannel(doSetUp("url") + SlackEndpoints.RENAMECHANNEL, "Authorization",doSetUp("token"), SlackEndpoints.RENAME_CHANNEL_REQ);
        slackServices.assertSuccessStatus(response);
        System.out.println(response.body().asString());


    }

    @Test(priority = 4)
    public void getChannelList() throws Exception {
        System.out.println("Renaming a channel name");
        response = slackServices.channelList(doSetUp("url") + SlackEndpoints.CHANNELLIST, "Authorization",doSetUp("token"));
        slackServices.assertSuccessStatus(response);
        System.out.println(response.body().asString());
        System.out.println("Validate response body that channel has been changed");
        ArrayList<String> fieldResponse = response.jsonPath().get("channels.name");
        System.out.println(fieldResponse);
        boolean isChanged=false;
        for(int i=0;i<fieldResponse.size();i++){
            if(fieldResponse.get(i).equals("generalplivotest")){
                System.out.println("Channel has been renamed");
                isChanged = true;
                break;
            }
        }
        if(isChanged==false){
            System.out.println("Channel has not been renamed");
        }
    }

    @Test(priority = 5)
    public void archiveChannel() throws Exception {
        System.out.println("Archive a channel");
        response = slackServices.createChannel(doSetUp("url") + SlackEndpoints.ARCHIVECHANNEL, "Authorization",doSetUp("token"), SlackEndpoints.ARCHIVE_CHANNEL_REQ);
        slackServices.assertSuccessStatus(response);
        System.out.println(response.body().asString());
    }

    @Test(priority = 6)
    public void validateArchivedChannel() throws Exception{
        System.out.println("Validating if the channel has been archived");
        response=slackServices.channelList(doSetUp("url")+SlackEndpoints.CHANNELLIST,"Authorization", doSetUp("token"));
        ArrayList<HashMap<String, Object>> fieldResponse = response.jsonPath().get("channels"); //size=6
        String channelId=doSetUp("channelId");
        slackServices.validateChannelArchived(fieldResponse, channelId);

    }

}