package Szaffi.network.devices;

public class NormalDevice extends Device {

    private int yearWhenManufactured;
    private String actualScreenSize;

    public NormalDevice() {
    }

    public NormalDevice(int year, int batteryLife, int actualYear) {
        super(year, batteryLife, actualYear);
        this.yearWhenManufactured = year;
        this.actualScreenSize = setScreensize();
    }

    @Override
    public void calculateRemainingPower() {

    }


}
