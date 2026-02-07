public class Main {
    public static void main(String[] args) {
        SmartAppliance sa =
                new SmartAppliance(101, 1200.5, true);
        Device deviceRef = sa;
        HomeController controller = new HomeController();
        controller.controlDevice(deviceRef);
    }
}

//output
// Operating appliance with power consumption: 1200.5W
// Smart features enabled: true

