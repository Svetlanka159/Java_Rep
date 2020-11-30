public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    private String name;
    private int stamina;
    private static int countPlayers;

    public Player(String name, int stamina){
        this.name = name;
        this.stamina = stamina;
        if (countPlayers<6) {
            countPlayers++;
        }
    }
    public int getStamina(){
        return stamina;
    }
    public String getName(){
        return name;
    }
    public void run(){
        //int curStamina = stamina;
        //String name = this.name;
        if(stamina==0){
            return;
        }

        stamina--;

        if(stamina == 0){
            countPlayers--;
            System.out.println("Игрок "+name+" устал и уходит с поля.");
        }
    }
    public static void info(){
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}
