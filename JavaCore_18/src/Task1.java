public class Task1 {
    public static void main(String[] args) {
        int myMas[] = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
        int counter = myMas.length; //задаем счетчик рекурсивного вызова

        System.out.println(recursionSum(myMas, counter-1));
    }

    public static int recursionSum(int mas[], int count){

        if(count == 0)
            return mas[count];

        return (mas[count] + recursionSum(mas, count-1));
    }

}
