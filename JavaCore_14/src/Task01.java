import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        File myFile = new File("Test");

        printSumDigits(myFile);
    }

    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int counter = 0;

            if (numbersString.length != 10){
                throw new IllegalArgumentException();
            }

            for(String number : numbersString){
                numbers[counter++] = Integer.parseInt(number);
            }

            int sum = 0;
            for (int i = 0; i<numbers.length; i++){
                sum += numbers[i];
            }
            System.out.println("Сумма всех чисел = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл.");
        }
    }
}
