import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(25.5,
                "LR343PU",
                Color.BLUE,
                true);

        Car johnsCar = new Car(13.9,
                "PU45PM1",
                Color.RED,
                false);

        System.out.println("My car's License Plate: " + myCar.licensePlate);
        System.out.println("John's car's License Plate: " + johnsCar.licensePlate);
    }

}
