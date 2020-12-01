public class Task_01 {
    public static void main(String[] args) {
       //первый вариант с помощью конкатенации строк
       long start = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i<=20000; i++){
            str = str+" "+i;
        }
        System.out.println(str);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        //второй вариант с помощью StringBuilder
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for(int j = 0; j<=20000; j++){
            sb.append(" ").append(j);
        }
        System.out.println(sb);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }
}
