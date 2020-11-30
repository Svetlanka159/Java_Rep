public class Task_01 {
    public static void main(String[] args) {
      //задание №1
        Airplane airplane1 = new Airplane("France Air", 2008, 3, 4);
        Airplane airplane2 = new Airplane("New Zeland Airplane Company", 2004, 14, 20);
        Airplane.compareAirplanes(airplane1, airplane2);
        System.out.println();

        //задание №2
        Player player1 = new Player("Вася", 90);
        Player.info();
        Player player2 = new Player("Сережа", 92);
        Player player3 = new Player("Антон", 100);
        Player player4 = new Player("Саша", 95);
        Player player5 = new Player("Боря", 90);
        Player player6 = new Player("Вадим", 97);
        Player.info();

        Player player7 = new Player("Николай", 99);
        Player player8 = new Player("Жора", 91);
        Player.info();

        System.out.println();
        int startStaminaPlr1 = player4.getStamina();
        for (int i=0; i<startStaminaPlr1; i++){
            //System.out.println(player4.getStamina());
            player5.run();
            //System.out.println();
            //System.out.println(player4.getStamina());
        }
        int startStaminaPlr2 = player4.getStamina();
        for (int i=0; i<startStaminaPlr2; i++){
            player2.run();
        }
        Player.info();
    }
}
