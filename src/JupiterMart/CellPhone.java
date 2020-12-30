package JupiterMart;

public class CellPhone extends Product {
    private int screenSize;
    private String OS;
    public CellPhone(int ID, double price, int screenSize, String OS) {
        super(ID, price);
        this.screenSize = screenSize;
        this.OS = OS;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
