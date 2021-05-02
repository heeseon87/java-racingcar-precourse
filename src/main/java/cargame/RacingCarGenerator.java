package cargame;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGenerator {
	public static List<RacingCar> createCars(String carData) {
		String[] carStrArr = carData.split(",");

		List<RacingCar> cars = new ArrayList<>();
		for (String name : carStrArr) {
			cars.add(new RacingCar(name));
		}

		return cars;
	}
}
