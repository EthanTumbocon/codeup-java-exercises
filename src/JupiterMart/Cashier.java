package JupiterMart;

import java.util.ArrayList;

public class Cashier {
    private String firstName;
    private String lastName;

    public Cashier(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void ringItem(Product item){
        System.out.println("ID # " + item.getID() + " cost " + item.getPrice());
    }
    public double askForMoney(ArrayList<Product> cart){
        double total = 0;
        for(Product item : cart){
            total += item.getPrice();
        }
        return total;
    }
}
