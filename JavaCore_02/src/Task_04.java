import java.util.Scanner;
import static java.lang.Math.*;

public class Task_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите агумент x: ");
        double x = s.nextDouble();
        double y;
        if (x>=5){
            y = (pow(x,2)-10)/(x+7);
            System.out.println("y = "+y);
        }
        else if (x>-3 && x<5) {
            y = (x+3)*(pow(x,2)-2);
            System.out.println("y = "+y);
        }
        else {
            y = 420;
            System.out.println("y = "+y);
        }
    }
}
