package Baitapthem.entities;

import java.util.ArrayList;

public class KhachHang {
    private String name;
    private String addressNumber;
    private int meterNumberCode;

    public KhachHang(String name, String addressNumber, int meterNumberCode) {
        this.name = name;
        this.addressNumber = addressNumber;
        this.meterNumberCode = meterNumberCode;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public int getMeterNumberCode() {
        return meterNumberCode;
    }

    public void setMeterNumberCode(int meterNumberCode) {
        this.meterNumberCode = meterNumberCode;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "name='" + name + '\'' +
                ", addressNumber=" + addressNumber +
                ", meterNumberCode=" + meterNumberCode +
                '}';
    }
}
