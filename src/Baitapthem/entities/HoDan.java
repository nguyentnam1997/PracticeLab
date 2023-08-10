package Baitapthem.entities;

public class HoDan {
    private String name;
    private int addressNumber;
    private int meterNumber;

    public HoDan(String name, int addressNumber, int meterNumber) {
        this.name = name;
        this.addressNumber = addressNumber;
        this.meterNumber = meterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    public double getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(double meterNumber) {
        this.meterNumber = meterNumber;
    }
}
