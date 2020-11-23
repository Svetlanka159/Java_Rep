import java.util.Arrays;
import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        Random random = new Random();

        for(int i=0; i<matrice.length; i++){
            for(int j=0; j<matrice[i].length; j++){
                matrice[i][j] = random.nextInt(50);
            }
        }

        for(int i=0; i<matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        int[] newArray = new int[matrice.length]; //массив для хранения суммы чисел каждой строки двумерного массива matrice
        for(int i=0; i<matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                newArray[i] = newArray[i] + matrice[i][j];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        int maxSumInStr = newArray[0]; //maxSumInStr - максимальная сумма в строке
        int Str = 0;                    //Str - индекс строки массива
        int k = 0;                      //k - переменная для хранения индекса строки с максимальной суммой
        for(int param:newArray){
            if(param>=maxSumInStr){
                maxSumInStr = param;
                k = Str;
            }
            Str++;
        }

        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + k);
    }
}
