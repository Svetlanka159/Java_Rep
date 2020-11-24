package com.company;

public class Task_02 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike(2003, "Honda", "красный");
        System.out.println("У меня есть мотоцикл - " + "модель " + myBike.getModel() + ", цвет " + myBike.getColor()+", года выпуска " + myBike.getYear());
    }
}

class Motorbike{
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color){
        this.year = year;
        this.model = model;
        this.color = color;
    }
    public int getYear(){
        return year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
}