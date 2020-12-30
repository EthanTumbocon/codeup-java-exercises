package JupiterMart;

public abstract class products {
    protected int ID;
    protected double price;

    public products(int ID, double price){
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
