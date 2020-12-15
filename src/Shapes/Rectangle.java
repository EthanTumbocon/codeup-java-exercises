package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    protected double length;
    protected double width;

    public Rectangle (double length, double width){
        super(length,width);
    }
    @Override
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public double getArea(){
        System.out.println("The area of the rectangle is: ");
        return length * width;
    }
    @Override
    public double getPerimeter(){
        System.out.println("The perimeter of the rectangle is: ");
        return 2 * length + 2 * width;
    }

}
