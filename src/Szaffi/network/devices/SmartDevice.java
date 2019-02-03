package Szaffi.network.devices;

import java.util.*;

public class SmartDevice extends Device {
    private List normalDevices = new ArrayList();
    private List<String> smartDeviceNames = new ArrayList();
    private String name;
    private String actualScreenSize;

    public SmartDevice() {
    }

    public SmartDevice(int year, int batteryLife, int actualYear, List<SmartDevice> smartDevices) {
        super(year, batteryLife, actualYear);
        getSmartDeviceNames(smartDevices);
        this.name = nameGenerator();
        this.actualScreenSize = setScreensize();
    }

    @Override
    public void calculateRemainingPower() {

    }

    private String nameGenerator() {
        String charContainer = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder builder = new StringBuilder();
        Random rand = new Random();

        while (builder.toString().length() == 0) {
            int length = 7;
            for (int i = 0; i < length; i++) {
                builder.append(charContainer.charAt(rand.nextInt(charContainer.length())));
            }
            if (smartDeviceNames.contains(builder.toString())) {
                builder = new StringBuilder();
            }
            smartDeviceNames.add(builder.toString());
        }
        return builder.toString();
    }

    private void getSmartDeviceNames(List<SmartDevice> smartDevices) {
        for (SmartDevice device :
                smartDevices) {
            smartDeviceNames.add(device.getName());
        }
    }

    public String getName() {
        return name;
    }
}
