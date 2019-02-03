package Szaffi.network.devices;

import java.util.ArrayList;
import java.util.List;

public class ConnectedDevice extends Device {

    private List<ConnectedDevice> connectedDevices = new ArrayList<>();

    public ConnectedDevice() {
    }

    public ConnectedDevice(int year, int batteryLife, int actualYear, List<ConnectedDevice> connectedDevices) {
        super(year, batteryLife, actualYear);
        this.connectedDevices = connectedDevices;
    }

    @Override
    public void calculateRemainingPower() {

    }

    public void setConnectedDevices(List<ConnectedDevice> connectedDevices) {
        this.connectedDevices = connectedDevices;
    }

}
