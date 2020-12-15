import java.util.ArrayList;

public class MessageDatabase {
    private static ArrayList<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text){
        Message mes = new Message(u1, u2, text);
        messages.add(mes);
    }

    public static ArrayList<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for(Message someMessage:  MessageDatabase.getMessages()){
            if (someMessage.getSender() == u1 && someMessage.getReceiver() == u2){
                System.out.println(someMessage.getSender().getUsername() + ": " + someMessage.getText());
            }
            if (someMessage.getSender() == u2 && someMessage.getReceiver() == u1){
                System.out.println(someMessage.getSender().getUsername() + ": " + someMessage.getText());
            }
        }
    }
}
