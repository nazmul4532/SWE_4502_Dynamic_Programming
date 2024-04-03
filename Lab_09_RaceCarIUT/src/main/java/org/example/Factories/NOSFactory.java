package org.example.Factories;
import org.example.Objects.Car.Car;
import org.example.Objects.NOS.NOS;
import org.example.Objects.NOS.ResonacNOS;
import org.example.Objects.NOS.SemaNOS;

public class NOSFactory {
    public static NOS createNOS(String nosType, Car car) {
        if (nosType.equalsIgnoreCase("Resonac")||nosType.equalsIgnoreCase("1")) {
            return new ResonacNOS(car);
        } else if (nosType.equalsIgnoreCase("Sema")||nosType.equalsIgnoreCase("2")) {
            return new SemaNOS(car);
        }
        return null;
    }
}
