import java.util.Arrays;
import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random random = new Random();

        for (int i = 0; i<mas.length; i++){
            mas[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(mas));


        int maxSum = 0;
        int idx = 0;
        for (int i = 0; i<(mas.length-2); i++){
            int sum = 0;
            for(int j = i; j<i+3; j++){
                sum = sum + mas[j];
            }
            if (sum>maxSum){
                maxSum = sum;
                idx = i;
            }
        }
        System.out.println("Максимальная сумма среди трех соседних элементов: "+maxSum);
        System.out.println("индекс первого элемента тройки:"+idx);
    }
}
