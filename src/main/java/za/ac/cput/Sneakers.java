package za.ac.cput;

public class Sneakers {
    private String sName;
    private double sPrice;

    public Sneakers(String sName, double sPrice) {
        this.sName = sName;
        this.sPrice = sPrice;
    }

    public String getsName() {
        return sName;
    }

    public double getsPrice() {
        return sPrice;
    }
}
