package JupiterMart;

public abstract class Product {
    protected int ID;
    protected double price;

    public Product(int ID, double price){
        this.ID = ID;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
