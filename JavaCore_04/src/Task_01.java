import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = s.nextInt();
        int[] mas = new int[n];
        Random rand = new Random();
        for (int i = 0; i<mas.length; i++){
            mas[i] = rand.nextInt(10);
        }
        System.out.print("Массив чисел от 0 до 10: ");

        for (int i = 0; i<mas.length; i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println("\n");
        System.out.println("***Информация о массиве***");
        System.out.println("Длина массива: " + n);
        int k = 0;
        int j = 0;
        int m = 0;
        int h = 0;
        int sum = 0;
        for (int i = 0; i<mas.length; i++){
            sum = sum + mas[i];
            if (mas[i] > 8){
                k = k+1;
            }
            if (mas[i] == 1){
                j = j+1;
            }
            if (mas[i] % 2 == 0){
                m = m+1;
            }
            if (mas[i] % 2 != 0){
                h = h+1;
            }
        }
        System.out.println("Количество чисел больше 8: " + k);
        System.out.println("Количество чисел равных 1: " + j);
        System.out.println("Количество четных чисел: " + m);
        System.out.println("Количество нечетных чисел: " + h);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
