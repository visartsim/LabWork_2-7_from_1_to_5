package com.brainacad.labwork;

/**
 * Created by visartsim on 13.07.16.
 */
public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer =" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        //вывод в консоль классов сравниваемых объектов
        System.out.println("Class of the first object - " + this.getClass());
        System.out.println("Class of the second object - " + o.getClass());

        if (!(this.getClass() == o.getClass()))
            return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0)
            return false;
        if (!manufacturer.equals(device.manufacturer))
            return false;
        if (!serialNumber.equals(device.serialNumber))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }
}
