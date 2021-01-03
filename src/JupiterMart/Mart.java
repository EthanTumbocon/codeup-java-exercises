package JupiterMart;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mart {
    public static void main(String[] args){
        Product dell = new Computer(1, 1399.99, "Windows",true);
        Product iphone = new CellPhone(2,1200, 8,"IOS");
        Product PC = new Computer(3,1599.99, "Windows", false);
        Product android = new CellPhone(4,1299.99, 9, "Linux");
    Cashier me = new Cashier("ethan", "tumbocon");

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(iphone);
        cart.add(dell);
        cart.add(PC);
        int idCounter = 0;
        for(Product item : cart){
            item.setID(idCounter);
            idCounter++;
        }
        me.ringItem(dell);
        me.ringItem(iphone);
        me.ringItem(PC);
        System.out.println("Your total is $" + me.askForMoney(cart));
    }
}
