package cargame;

import java.util.ArrayList;
import java.util.List;

public class RacingCarList {

	private List<RacingCar> cars;

	private RacingCarList(List<RacingCar> cars) {
		this.cars = cars;
	}

	public static RacingCarList attend(String carData) {
		String[] carStrArr = carData.split(",");

		List<RacingCar> cars = new ArrayList<>();
		for (String name : carStrArr) {
			cars.add(new RacingCar(name));
		}

		return new RacingCarList(cars);
	}

	public void race() {
		for (RacingCar car : cars) {
			car.move((Energy.createEnergy(new RandomEnergyGeneratorPolicy())));
		}
	}

	public void print() {
		for (RacingCar car : cars) {
			car.print();
		}
	}

	public int size() {
		return cars.size();
	}
}
