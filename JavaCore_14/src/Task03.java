import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        System.out.println(parseFileToObjList());
    }

    public static List<Human> parseFileToObjList(){
        try{
            List<Human> peopleList = new ArrayList<>();


            File peopleFile = new File("people.txt");
            Scanner scanner = new Scanner(peopleFile);
            while(scanner.hasNextLine()){
                String curLine = scanner.nextLine();
                String[] numbersString = curLine.split(" ");
                int age = Integer.parseInt(numbersString[1]);
                if (age < 0){
                    throw new IllegalArgumentException();
                }
                //peopleList.add(curLine);
                //User user1 = new User("Mary");
                Human myHuman = new Human(numbersString[0], age);
                peopleList.add(myHuman);
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
