package main.Laboratorio.design.patterns.creational.builder.example.builders;

import main.Laboratorio.design.patterns.creational.builder.example.cars.CarType;
import main.Laboratorio.design.patterns.creational.builder.example.components.Engine;
import main.Laboratorio.design.patterns.creational.builder.example.components.GPSNavigator;
import main.Laboratorio.design.patterns.creational.builder.example.components.Transmission;
import main.Laboratorio.design.patterns.creational.builder.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
