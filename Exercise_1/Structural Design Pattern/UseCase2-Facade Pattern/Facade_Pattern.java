// Subsystem classes
class Light {
    public void turnOn() {
        System.out.println("Lights are on");
    }

    public void turnOff() {
        System.out.println("Lights are off");
    }
}

class AirConditioner {
    public void turnOn() {
        System.out.println("AirConditioner is on");
    }

    public void turnOff() {
        System.out.println("AirConditioner is off");
    }
}

// Facade class
class HomeAutomationFacade {
    private Light light;
    private AirConditioner ac;

    public HomeAutomationFacade() {
        light = new Light();
        ac = new AirConditioner();
    }

    public void activateHomeMode() {
        light.turnOn();
        ac.turnOn();
        System.out.println("Home mode activated.");
    }

    public void deactivateHomeMode() {
        light.turnOff();
        ac.turnOff();
        System.out.println("Home mode deactivated.");
    }
}

// Demonstration
public class Facade_Pattern {
    public static void main(String[] args) {
        HomeAutomationFacade homeAutomation = new HomeAutomationFacade();
        homeAutomation.activateHomeMode();
        homeAutomation.deactivateHomeMode();
    }
}
