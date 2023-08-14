package Baitapthem.entities;

public class BienLai {
    private KhachHang khachHang;
    private int oldMeterNumber;
    private int newMeterNumber;
    private final double cash;

    public BienLai(KhachHang khachHang, int oldMeterNumber, int newMeterNumber) {
        this.khachHang = khachHang;
        this.oldMeterNumber = oldMeterNumber;
        this.newMeterNumber = newMeterNumber;
        this.cash = (newMeterNumber - oldMeterNumber) * 750;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
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

    @Override
    public String toString() {
        return "BienLai{" +
                "khachHang=" + khachHang +
                ", oldMeterNumber=" + oldMeterNumber +
                ", newMeterNumber=" + newMeterNumber +
                ", cash=" + cash +
                '}';
    }
}
