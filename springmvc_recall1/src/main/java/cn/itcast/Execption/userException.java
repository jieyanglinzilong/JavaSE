package cn.itcast.Execption;

public class userException  extends  Exception{
    private String messages;

    public String getMessages() {
        return messages;
    }

    public userException(String messages) {
        this.messages = messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
