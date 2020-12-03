public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    public double area(){
        double areaRectangle;
        areaRectangle = width*height;
        return areaRectangle;
    }
    public double perimeter(){
        double perimeterRectangle;
        perimeterRectangle = 2*(width+height);
        return perimeterRectangle;
    }
}
