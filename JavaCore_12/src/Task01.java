import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Skoda");
        arrayList.add("Volvo");
        arrayList.add("Mini");
        arrayList.add("Volkswagen");
        arrayList.add("Mercedes");

        for(String carMark : arrayList){
            System.out.println(carMark);
        }

        arrayList.remove(0);
        System.out.println();
        for(String carMark : arrayList){
            System.out.println(carMark);
        }
    }
}
