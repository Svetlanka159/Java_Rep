import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>=b){
            System.out.println("Некорректный ввод!");
        }
        else {
            for (int i = a; i < b; i++)
            if (i % 5 == 0 && i % 10 != 0) {
                    System.out.println(i + " ");
                }
        }
    }
}
