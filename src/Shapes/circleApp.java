package Shapes;

import util.Input;

public class circleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean answer = true;
        do{
            double radius = input.getDouble(1,100);
            circle circle1 = new circle(radius);

            System.out.println("Circumference: " + circle1.getCircumference());
            System.out.println("Area: " + circle1.getArea());

//            answer = input.yesNo("Do you want to create another circle?");
        }while(answer);
        System.out.println("You've created " + circle.getCircleCount() + " circles");



//        System.out.println("Please enter the circle radius");
//        double radius1 = input.getDouble();
//
//        Circle circle1 = new Circle(radius1);
//        System.out.println("Circumference: " + circle1.getCircumference());
//        System.out.println("Area: " + circle1.getArea());
    }
}
