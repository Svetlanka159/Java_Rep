import java.util.ArrayList;

public class User {
    private String username;
    ArrayList<User> subscription;

    public User(String username){
        this.username = username;
        this.subscription = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public ArrayList<User> getSubscription(){
        return subscription;
    }

    public void subscribe(User user){
        this.subscription.add(user);
    }

    public boolean isSubscribed(User user){
        boolean isSubscribedFlg = false;
        for(User username : this.subscription) {
            if (username.getUsername().equals(user.getUsername())) {
                isSubscribedFlg = true;
            }
        }
        return  isSubscribedFlg;
    }

    public boolean isFriend(User user){
        boolean isFriendFlg = false;
        if (this.isSubscribed(user) && user.isSubscribed(this)){
            isFriendFlg = true;
        }
        return isFriendFlg;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString(){
        return username;
    }
}
