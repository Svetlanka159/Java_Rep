package com.company;

public class Main {

    public static void main(String[] args) {
        Car myPrivateCar = new Car();
        myPrivateCar.setYear(2013);
        myPrivateCar.setModel("Skoda Yeti");
        myPrivateCar.setColor("Navy Blue");

        System.out.println("Год выпуска автомобиля: " + myPrivateCar.getYear());
        System.out.println("Модель автомобиля: " + myPrivateCar.getModel());
        System.out.println("Цвет автомобиля: " + myPrivateCar.getColor());
    }
}

class Car{
    private int year;
    private String model;
    private String color;

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