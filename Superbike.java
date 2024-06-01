//abstract
abstract class SuperbikeCockpit {
    public abstract void startEngine();

    public void stopEngine() {
        System.out.println("Superbike engine stopped");
    }

    public void displayInfo(String SuperbikeModel) {
        System.out.println("Superbike model: " + SuperbikeModel);
    }
}

//interface
interface SuperbikeFeatures {
    void launchControl();
    void quickShifter();
    void cruiseControl();
}

//BMWS1000RR mengimplementasi interface "SuperbikeFeatures"
class BMWS1000RR extends SuperbikeCockpit implements SuperbikeFeatures {
    public void startEngine() {
        System.out.println("S1000RR engine started");
    }

    public void launchControl() {
        System.out.println("S1000RR launch control activated");
    }

    public void quickShifter() {
        System.out.println("S1000RR quick shifter activated");
    }

    public void cruiseControl() {
        System.out.println("S1000RR cruise control activated");
    }
}

public class Superbike {
    public static void main(String[] args) {
        SuperbikeCockpit S1000RR = new BMWS1000RR();

        S1000RR.displayInfo("BMW S1000RR 2021");
        S1000RR.startEngine();
        ((BMWS1000RR) S1000RR).launchControl();
        ((BMWS1000RR) S1000RR).quickShifter();
        ((BMWS1000RR) S1000RR).cruiseControl();
        S1000RR.stopEngine();
    }
}