package main.Laboratorio.design.patterns.creational.builder.example.director;

import main.Laboratorio.design.patterns.creational.builder.example.builders.Builder;
import main.Laboratorio.design.patterns.creational.builder.example.cars.CarType;
import main.Laboratorio.design.patterns.creational.builder.example.components.Engine;
import main.Laboratorio.design.patterns.creational.builder.example.components.GPSNavigator;
import main.Laboratorio.design.patterns.creational.builder.example.components.Transmission;
import main.Laboratorio.design.patterns.creational.builder.example.components.TripComputer;

public class Director {

	public void constructSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

	public void constructSUV(Builder builder) {
		builder.setCarType(CarType.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setGPSNavigator(new GPSNavigator());
	}
}