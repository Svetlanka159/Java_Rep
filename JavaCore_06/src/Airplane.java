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

}
