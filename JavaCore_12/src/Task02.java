import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i=0; i<=30; i+=2){
            arrayList.add(i);
        }

        for(int i=300; i<=350; i+=2){
            arrayList.add(i);
        }

        for(int j=0; j<arrayList.size(); j++){
            System.out.println(arrayList.get(j));
        }
    }
}
