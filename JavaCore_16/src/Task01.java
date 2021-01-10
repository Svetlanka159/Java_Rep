import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        File file = new File("Digits.txt");

        printResult(file);
    }

    public static void printResult(File file){
        try
        {
            Scanner scanner = new Scanner(file);
            String[] numbersString = scanner.nextLine().split(" ");
            int[] numbers = new int[numbersString.length];
            int counter = 0;
            
            for(String number : numbersString){
                numbers[counter++] = Integer.parseInt(number);
            }
            //System.out.println(Arrays.toString(numbers));

            int sum = 0;
            for(int i = 0; i<numbers.length; i++){
                sum += numbers[i];
            }
            double arithmeticMean = (double)sum / numbers.length;
            System.out.printf("Среднее арифметическое: " + arithmeticMean + " --> " + "%.3f",arithmeticMean);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден");;
        }
    }
}
