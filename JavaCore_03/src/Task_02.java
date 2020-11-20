import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                while(true){
                    System.out.println("Введите два числа - делимое и делитель:");
                    double dividend = scanner.nextDouble();
                    double divider = scanner.nextDouble();

                    if (divider==0){
                        break;
                    }
                    else{
                        double result = dividend/divider;
                        System.out.println("Результат деления:" + result);
                    }
                }
    }
}
