import java.util.Arrays;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random random = new Random();

        for (int i = 0; i<mas.length; i++){
            mas[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(mas));

        int maxValue = mas[0];
        int minValue = mas[0];
        int k = 0;
        int sum = 0;
        for(int param:mas){
            if (param > maxValue){
                maxValue = param;
            }
            if (param < minValue){
                minValue = param;
            }
            if (param%10 == 0){
                k = k+1;
                sum = sum + param;
            }

        }
        System.out.println("Наибольший элемент массива: " + maxValue);
        System.out.println("Наименьший элемент массива: " + minValue);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + k);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
