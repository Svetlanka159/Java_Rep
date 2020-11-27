public class Car {
    private int year;
    private String model;
    private String color;

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int userYear){
        int difYear = userYear - year;
        return difYear;
    }

    public void setYear(int inputYear){
        year = inputYear;
    }
    public int getYear(){
        return year;
    }

    public void setModel(String inputModel){
        model = inputModel;
    }
    public String getModel(){
        return model;
    }

    public void setColor(String inputColor){
        color = inputColor;
    }
    public String getColor(){
        return color;
    }
}