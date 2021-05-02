package cargame;

import java.util.ArrayList;
import java.util.List;

public class RacingCarList {

	private List<RacingCar> racingCars;

	private RacingCarList(List<RacingCar> racingCars) {
		this.racingCars = racingCars;
	}

	public List<RacingCar> getRacingCars() {
		return racingCars;
	}

	public static RacingCarList attend(String carData) {
		String[] carStrArr = carData.split(",");

		List<RacingCar> racingCars = new ArrayList<>();
		for (String name : carStrArr) {
			racingCars.add(new RacingCar(name));
		}

		return new RacingCarList(racingCars);
	}

	public void race() {
		for (RacingCar racingCar : racingCars) {
			racingCar.move((Energy.createEnergy(new RandomEnergyGeneratorPolicy())));
		}
	}

	public void print() {
		for (RacingCar racingCar : racingCars) {
			racingCar.print();
		}
		System.out.println();
	}

	public int size() {
		return racingCars.size();
	}
}
