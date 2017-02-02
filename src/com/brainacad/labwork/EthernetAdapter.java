package com.brainacad.labwork;

/**
 * Created by visartsim on 13.07.16.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: manufacturer - " + super.getManufacturer() +
                ", price - " + super.getPrice() +
                ", serial number - " + super.getSerialNumber() +
                ", speed - " + speed +
                ", mac - " + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(this.getClass() == o.getClass()))
            return false;
        if (!super.equals(o))
            return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed)
            return false;
        if (!mac.equals(that.mac))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}
