public class Main {
    public static void main(String[] args) {
        //задача №1
        Car myCar = new Car();
        myCar.info();
        Motorbike myBike = new Motorbike(1997, "Harley Davidson", "Grey");
        myBike.info();

        myCar.setYear(1987);
        int year1 = myCar.yearDifference(2020);
        System.out.println("Этой машине " + year1 + " лет");

        int year2 = myBike.yearDifference(2020);
        System.out.println("Этому мотоциклу " + year2 + " лет");

        //задача №2
        Airplane myAir = new Airplane("France Air", 2008, 3, 4);
        myAir.setYear(2013);
        myAir.setLength(6);
        myAir.fillUp(15);
        myAir.fillUp(25);
        System.out.println();
        myAir.info();

        //задача №3
        Teacher someTeacher = new Teacher("Коваленко Иван Петрович", "Высшая математика");
        Student someStudent = new Student("Петров Алексей Иванович");
        System.out.println();
        someTeacher.evaluate(someStudent);
    }
}
