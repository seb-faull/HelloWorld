import java.awt.*;

public class Car {

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColour;   // from jwt library
    boolean areTailLightsWorking;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColour,
               boolean inputAreTailLightsWorking) {

        this.averageMilesPerGallon  = inputAverageMPG;
        this.licensePlate           = inputLicensePlate;
        this.paintColour            = inputPaintColour;
        this.areTailLightsWorking   = inputAreTailLightsWorking;

    }

}
