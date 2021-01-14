package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

public class Car {
    public int numberOfWheels;
    public SeatBelt seatBelt;
    public String color;
    public Windscreen windscreen;
    public Engine engine;

    public Car() {
    }

    public Car(int numberOfWheels, SeatBelt seatBelt, String color, Windscreen windscreen, Engine engine) {
        this.numberOfWheels = numberOfWheels;
        this.seatBelt = seatBelt;
        this.color = color;
        this.windscreen = windscreen;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", seatBelt=" + seatBelt.getBrand() +
                ", color='" + color + '\'' +
                ", windscreen=" + windscreen.getName() +
                ", engine=" + engine.getName() +
                '}';
    }
}
