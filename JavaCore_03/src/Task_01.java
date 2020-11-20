import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        String str = "Stop";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            if (city.equals(str)){
                break;
            }

            switch (city){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
