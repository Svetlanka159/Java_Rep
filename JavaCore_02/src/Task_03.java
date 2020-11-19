import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>=b){
            System.out.println("Некорректный ввод!");
        }
        else{
            while(a<b){
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.println(a + " ");
                }
                a++;
            }
        }
    }
}
