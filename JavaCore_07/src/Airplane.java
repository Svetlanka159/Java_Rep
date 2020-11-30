public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setYear(int inputYear){
        year = inputYear;
    }
    public void setLength(int inputLength){
        length = inputLength;
    }
    public int getFuel(){
        return fuel;
    }
    public int getLength(){
        return length;
    }
    public String getProducer(){
        return producer;
    }
    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + " метров" + ", вес: " + weight + " тонны" + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int userFuel){
        fuel += userFuel;
        return fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        int lengthAir1 = airplane1.getLength();
        int lengthAir2 = airplane2.getLength();
        if (lengthAir1 > lengthAir2){
            System.out.println("Длина самолета "+airplane1.getProducer()+" больше длины самолета "+airplane2.getProducer()+".");
        }
        else if (lengthAir2 > lengthAir1){
            System.out.println("Длина самолета "+airplane2.getProducer()+" больше длины самолета "+airplane1.getProducer()+".");
        }
    }

}
