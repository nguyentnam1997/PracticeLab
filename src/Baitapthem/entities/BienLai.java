package Baitapthem.entities;

public class BienLai {
    private HoDan hoDan;
    private int oldMeterNumber;
    private int newMeterNumber;
    private double cash;

    public BienLai(HoDan hoDan, int oldMeterNumber, int newMeterNumber) {
        this.hoDan = hoDan;
        this.oldMeterNumber = oldMeterNumber;
        this.newMeterNumber = newMeterNumber;
        this.cash = (newMeterNumber - oldMeterNumber)*750;
    }

    public HoDan getHoDan() {
        return hoDan;
    }

    public void setHoDan(HoDan hoDan) {
        this.hoDan = hoDan;
    }

    public int getOldMeterNumber() {
        return oldMeterNumber;
    }

    public void setOldMeterNumber(int oldMeterNumber) {
        this.oldMeterNumber = oldMeterNumber;
    }

    public int getNewMeterNumber() {
        return newMeterNumber;
    }

    public void setNewMeterNumber(int newMeterNumber) {
        this.newMeterNumber = newMeterNumber;
    }

    public double getCash() {
        return cash;
    }
}
