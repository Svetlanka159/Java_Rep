import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        List<String> someList = new ArrayList<>();
        someList = parseFileToStringList();
        System.out.println(someList);
    }

    public static List<String> parseFileToStringList(){
        try{
            List<String> peopleList = new ArrayList<>();

            File peopleFile = new File("people.txt");
            Scanner scanner = new Scanner(peopleFile);
            while(scanner.hasNextLine()){
                String curLine = scanner.nextLine();
                String[] numbersString = curLine.split(" ");
                if (Integer.parseInt(numbersString[1]) < 0){
                    throw new IllegalArgumentException();
                }
                peopleList.add(curLine);
            }
            scanner.close();
            return peopleList;
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл.");
        }
        return null;
    }
}
