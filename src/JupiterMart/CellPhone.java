package JupiterMart;

public class CellPhone extends products {
    private int screenSize;
    private String OS;

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

    public CellPhone(int ID, double price) {
        super(ID, price);
    }
}
