import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("Введите два числа - делимое и делитель:");
            double dividend = scanner.nextDouble();
            double divider = scanner.nextDouble();

            if (divider==0){
                System.out.println("Деление на 0 запрещено!");
                continue;
            }

            double result = dividend/divider;
            System.out.println("Результат деления:" + result);
        }
    }
}
