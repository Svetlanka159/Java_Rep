import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random rand = new Random();

        try
        {
            //генерация случайных чисел и запись их в file1.txt
            PrintWriter pw1 = new PrintWriter(file1);
            for (int i=0; i < 1000; i++){
                pw1.println(rand.nextInt(100));
            }
            pw1.close();

            //запись среднего арифметического для каждой группы из 20-ти чисел из file1.txt в file2.txt
            Scanner scanner = new Scanner(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            int cnt = 0;
            int sum = 0;
            while(scanner.hasNextLine()){
                int readDigit = Integer.parseInt(scanner.nextLine());
                sum += readDigit;
                cnt += 1;
                if(cnt == 20){
                    pw2.println((double)sum / cnt);
                    cnt = 0;
                    sum = 0;
                }
            }
            pw2.close();
            printResult(file2);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден");
        }

    }

    public static void printResult(File file){
        try
        {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while(scanner.hasNextLine()){
                double readDigit = Double.parseDouble(scanner.nextLine());
                sum += readDigit;
            }
            System.out.printf("Сумма чисел из файла file2.txt: " + "%.0f",sum);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден");
        }
    }
}
