package day44;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public void sendAtChannelMessage(){
        System.out.println("send at channel message");
    }
    public void deleteMessage(){
        System.out.println("delete message");
    }
    public void addChannel () {
        System.out.println("add channel");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public SlackAdminUser(int adminId, String name, String status) {
        this.adminId = adminId;
        this.name=name;
        this.status=status;
    }

    public static void main(String[] args) {

        SlackAdminUser s1=new SlackAdminUser(12345,"araz","closed");

s1.sendMessage();  // these 3 methods are inherited
s1.callSomeone();
s1.addEmoji();
s1.sendAtChannelMessage();
s1.deleteMessage();
s1.addChannel();
        System.out.println(s1);
    }

}
