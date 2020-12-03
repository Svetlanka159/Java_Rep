import static java.lang.Math.*;

public class Triangle extends Figure {
    private double length_a;
    private double length_b;
    private double length_c;

    public Triangle(String color, double length_a, double length_b, double length_c){
        super(color);
        this.length_a = length_a;
        this.length_b = length_b;
        this.length_c = length_c;
    }

    public double area(){
        double areaTriangle;
        double semiPerimeter;
        semiPerimeter = 0.5*(length_a+length_b+length_c);
        areaTriangle = sqrt(semiPerimeter*(semiPerimeter-length_a)*(semiPerimeter-length_b)*(semiPerimeter-length_c));
        return areaTriangle;
    }
    public double perimeter(){
        double perimeterTriangle;
        perimeterTriangle = length_a + length_b + length_c;
        return perimeterTriangle;
    }
}
