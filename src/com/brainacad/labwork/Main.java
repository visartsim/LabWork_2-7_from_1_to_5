package com.brainacad.labwork;

import com.brainacad.child.Monitor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Device device01 = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device01.toString());
        Monitor monitor01 = new Monitor(1280, 1024, "Samsung", 120, "AB1234567CD");

        System.out.println(monitor01.toString());

        //вывод результатов работы методов hashCode
        //class Device
        System.out.println("Device hashcode = " + device01.hashCode());
        //class Monitor
        System.out.println("Monitor hashcode = " + monitor01.hashCode());

        //вывод результатов работы методов equals и hashcode
        //для класса Device
        Device device02 = new Device("Samsung", 120, "AB1234567CD");
        System.out.println("check equals work " + device01.equals(device02));
        System.out.println("check hashcode work " + (device01.hashCode() == device02.hashCode()));
        System.out.println(device01.equals(monitor01));
        //для класса Monitor
        Monitor monitor02 = new Monitor(640, 480, "Samsung", 120, "AB1234567CD");
        System.out.println(monitor01.equals(device01));
        System.out.println(monitor01.equals(monitor02));

        //массив объектов типа Device
        Device[] masDevices = new Device[3];
        masDevices[0] = new Device("Samsung", 120, "FDGAF");
        masDevices[1] = new Monitor(1980, 1080, "Dell", 300, "FDGDA");
        masDevices[2] = new EthernetAdapter(100, "AFD543523", "Marvel", 300, "FDG32423");

        System.out.println("We have next devices: ");
        for(Device d : masDevices){
            System.out.println(d.toString());
        }

    }
}
