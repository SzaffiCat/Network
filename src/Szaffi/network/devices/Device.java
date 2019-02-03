package Szaffi.network.devices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Device {
    protected int age;
    protected int batteryLife;
    private int actualYear;

    public Device() {

    }

    public Device(int year, int batteryLife, int actualYear) {
        setAge(year, actualYear);
        this.batteryLife = batteryLife;
        this.actualYear = actualYear;
    }

    private void setAge(int year, int actualYear){
        this.age = actualYear - year;
    }

    protected String setScreensize(){
        List screenSizes = new ArrayList<>();
        Random rand = new Random();

        screenSizes.add("EDTV");
        screenSizes.add("HD");
        screenSizes.add("FULL HD");
        screenSizes.add("UHD");

        return screenSizes.get(rand.nextInt(screenSizes.size())).toString();
    }

    public abstract void calculateRemainingPower();

}
