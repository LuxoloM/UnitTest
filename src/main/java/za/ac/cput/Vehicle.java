package za.ac.cput;

public class Vehicle {
    private String vName;
    private int vModel;

    public Vehicle(String vName, int vModel) {
        this.vName = vName;
        this.vModel = vModel;
    }

    public String getvName() {
        return vName;
    }

    public int getvModel() {
        return vModel;
    }

}
