import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число этажей в здании: ");
        int floor = s.nextInt();
        if (floor>=1 && floor<=4){
            System.out.println("Малоэтажный дом");
        }
        else if (floor>=5 && floor<=8){
            System.out.println("Среднеэтажный дом");
        }
        else if(floor>=9) {
            System.out.println("Многоэтажный дом");
        }
        else if (floor<0){
            System.out.println("Ошибка ввода");
        }
    }
}
