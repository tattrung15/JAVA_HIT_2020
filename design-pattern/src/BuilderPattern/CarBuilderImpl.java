package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

public class CarBuilderImpl implements CarBuilder{
    public int numberOfWheels;
    public SeatBelt seatBelt;
    public String color;
    public Windscreen windscreen;
    public Engine engine;

    @Override
    public CarBuilder addWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder addSeatBelts(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
        return this;
    }

    @Override
    public CarBuilder paint(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder addWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
        return this;
    }

    @Override
    public CarBuilder addEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Car build() {
        return new Car(numberOfWheels, seatBelt, color, windscreen, engine);
    }
}
