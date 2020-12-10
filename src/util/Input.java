package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input(){
        sc = new Scanner(System.in);
    }

    public String getString(){

        return this.sc.nextLine();

    }

    public boolean yesNo(){

        System.out.println("Please enter yes or no");
        String input = this.sc.next();
        return(input.trim().toLowerCase().equals("y")) ||           input.trim().toLowerCase().equals("yes");
    }

    public int getInt(){
        System.out.println("Please enter an int.");
        return sc.nextInt();
    }

    public int getInt(int min, int max){
        int input;
        do{
            System.out.printf("Please enter an int between %d and %d", min, max);
            input = sc.nextInt();
        }while(input < min || input > max);

        return input;
    }


    public double getDouble(){
        System.out.println("Please enter an int.");

        return sc.nextDouble();
    }

    public double getDouble(double min, double max){
        double input;
        do{
            System.out.printf("Please enter a double between %.2f and %.2f", min, max);
            input = sc.nextDouble();
        }while(input < min || input > max);

        return input;
    }


}
