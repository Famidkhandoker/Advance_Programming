class SmartAppliance extends Appliance {
    boolean wifiEnabled;

    SmartAppliance(int deviceId, double powerConsumption, boolean wifiEnabled) {
        super(deviceId, powerConsumption);
        this.wifiEnabled = wifiEnabled;
    }

    void operate() {
        super.operate();
        System.out.println("Smart features enabled: " + wifiEnabled);
    }
}

