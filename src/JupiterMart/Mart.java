package JupiterMart;

public class Mart {
    public static void main(String[] args){
        Product dell = new Computer(1, 1399.99, "Windows",true);
        Product iphone = new CellPhone(2,1200, 8,"IOS");
        Product PC = new Computer(3,1599.99, "Windows", false);
        Product android = new CellPhone(4,1299.99, 9, "Linux");

    }
}
