package com.brainacad.child;

import com.brainacad.labwork.Device;

/**
 * Created by visartsim on 13.07.16.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    //constructor class Monitor
    public Monitor(int resolutionX, int resolutionY, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);

        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer= " + super.getManufacturer() +
                ", price=" + super.getPrice() +
                ". serialNumber=" + super.getSerialNumber() +
                ", X=" + resolutionX +
                ", Y=" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(this.getClass() == o.getClass()))
            return false;
        if (!super.equals(o))
            return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX)
            return false;
        if (resolutionY != monitor.resolutionY)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
