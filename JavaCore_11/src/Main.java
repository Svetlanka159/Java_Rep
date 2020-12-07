public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        System.out.println(warehouse1.toString());

        picker1.doWork();
        courier1.doWork();
        System.out.println();
        System.out.println(warehouse1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

        for (int i=0; i< 1501; i++){
            picker1.doWork();
            courier1.doWork();
        }
        picker1.bonus();
        courier1.bonus();
        System.out.println();
        System.out.println(warehouse1.toString());
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        courier2.doWork();
        System.out.println();
        System.out.println(warehouse1.toString());
        System.out.println(warehouse2.toString());
        System.out.println(picker2.toString());
        System.out.println(courier2.toString());
    }
}
