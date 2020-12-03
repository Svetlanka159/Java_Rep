import static java.lang.Math.*;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public double area(){
        double areaCircle;
        areaCircle = PI*pow(radius, 2);
        return areaCircle;
    }
    public double perimeter(){
        double perimeterCircle;
        perimeterCircle = 2*PI*radius;
        return perimeterCircle;
    }
}
