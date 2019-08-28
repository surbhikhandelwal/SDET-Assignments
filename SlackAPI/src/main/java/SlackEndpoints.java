public interface SlackEndpoints {
    public static final String CREATECHANNEL= "channels.create";
    public static final String CREATE_CHANNEL_REQ=System.getProperty("user.dir")+"/src/test/resources/TestData/createChannel.json";
    public static final String JOINCHANNEL= "channels.join";
    public static final String JOIN_CHANNEL_REQ=System.getProperty("user.dir")+"/src/test/resources/TestData/joinChannel.json";
    public static final String RENAMECHANNEL= "channels.rename";
    public static final String RENAME_CHANNEL_REQ=System.getProperty("user.dir")+"/src/test/resources/TestData/renameChannel.json";
    public static final String CHANNELLIST= "channels.list";
    public static final String ARCHIVECHANNEL= "channels.archive";
    public static final String ARCHIVE_CHANNEL_REQ=System.getProperty("user.dir")+"/src/test/resources/TestData/archiveChannel.json";


}
