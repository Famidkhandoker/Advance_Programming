class Appliance extends Device {
    double powerConsumption;

    Appliance(int deviceId, double powerConsumption) {
        super(deviceId);
        this.powerConsumption = powerConsumption;
    }

    void operate() {
        System.out.println("Operating appliance with power consumption: "
                + powerConsumption + "W");
    }
}

