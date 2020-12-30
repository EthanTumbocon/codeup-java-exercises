package JupiterMart;

public class Computer extends Product {
    private String OS;
    private boolean isLaptop;

    public Computer(int ID, double price, String OS, boolean isLaptop) {
        super(ID, price);
        this.OS = OS;
        this.isLaptop = isLaptop;
    }
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


}
