package JupiterMart;

public class Computer extends products {
    private String OS;
    private boolean isLaptop;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }

    public Computer(int ID, double price) {
        super(ID, price);

    }
}
