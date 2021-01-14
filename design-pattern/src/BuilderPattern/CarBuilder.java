package BuilderPattern;

import BuilderPattern.CarParts.Engine;
import BuilderPattern.CarParts.SeatBelt;
import BuilderPattern.CarParts.Windscreen;

public interface CarBuilder {
    CarBuilder addWheels(int numberOfWheels);
    CarBuilder addSeatBelts(SeatBelt seatBelt);
    CarBuilder paint(String color);
    CarBuilder addWindscreen(Windscreen windscreen);
    CarBuilder addEngine(Engine engine);
    Car build();
}
