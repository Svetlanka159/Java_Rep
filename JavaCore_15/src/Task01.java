import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path_fileIn = "src"+separator+"main"+separator+"resources"+separator+"shoes.csv";
        File file_csv = new File(path_fileIn);

        String path_fileOut = "src"+separator+"main"+separator+"resources"+separator+"missing_shoes.txt";
        File file_txt = new File(path_fileOut);

        try
        {
            Scanner scanner = new Scanner(file_csv);
            PrintWriter pw = new PrintWriter(file_txt);
            String[] readingString;
            while(scanner.hasNextLine()){
                readingString = scanner.nextLine().split(";");
                //System.out.println(Arrays.toString(readingString));
                if (Integer.parseInt(readingString[2]) == 0){
                    pw.println(readingString[0] + ", " + readingString[1] + ", " + readingString[2]);
                }
            }
            pw.close();
            scanner.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден.");
        }
    }
}
