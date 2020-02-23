package day44;
 /* Attributes: name, status  make it PROTECTED
    Behaviours: sendMessage, callSomeone, addEmoji

    Create 1 subclass called SlackAdminUser
    Attritube: adminId
    Behaviours: send AtChannelMessage, deleteMessage, addChannel

    Constructor: 3 args constructor to set all fields value

  */
public class SlackUser {
    protected String name;
    protected String status;

    public void sendMessage(){
        System.out.println("send Message"+name);
    }
public void callSomeone(){
    System.out.println(" call someone"+name);
}
public void addEmoji(){
    System.out.println(" add Emoji" +name);
}

}
