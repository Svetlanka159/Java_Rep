import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        /*FROM: 'Имя отправителя'
        TO: 'Имя получателя'
        ON: Sun Aug 30 19:07:34 MSK 2020
        'Текст сообщения'*/
        return "FROM: " + sender + "\nTO: " + receiver + "\nON: " + date + "\n" + text;
    }
}
