import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Mary");
        User user2 = new User("Brain");
        User user3 = new User("John");

        user1.subscribe(user2);
        user1.subscribe(user3);
        user2.subscribe(user1);
        user3.subscribe(user1);
        user3.subscribe(user2);

        //System.out.println(user2.getSubscription());
        user1.sendMessage(user2, "Привет! Как дела?");
        user1.sendMessage(user2, "Что делаешь в субботу?");
        user2.sendMessage(user1, "Привет, Мэри)");
        user2.sendMessage(user1, "Дела хорошо!");
        user2.sendMessage(user1, "На субботу пока нет никаких планов.");
        user3.sendMessage(user1, "Привет, Мэри!");
        user3.sendMessage(user1, "Ты уже писала Брайну про наш поход в галерею в субботу?");
        user3.sendMessage(user1, "Что он ответил?");
        user1.sendMessage(user3, "Привет, Джон");
        user1.sendMessage(user3, "Я только что спрашивала у него про планы на эту субботу.");
        user1.sendMessage(user3, "Он ответил, что у него нет никаких планов)");
        user3.sendMessage(user1, "Отлично! Зови его вместе с нами в галерею.");

        MessageDatabase.showDialog(user1, user3);
    }
}
