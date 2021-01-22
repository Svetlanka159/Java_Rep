import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = s.nextInt();
        System.out.println(count7(number));
    }

    public static int count7(int num){
        if (num == 0)
            return 0;

        if (num % 10 == 7)
            return (1 + count7(num/10));
        else
            return count7(num/10);
    }
}
