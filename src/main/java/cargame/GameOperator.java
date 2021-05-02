package cargame;

import java.util.List;
import java.util.Scanner;

public class GameOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분");
		String carData = sc.nextLine();

		System.out.println("시도할 회수는 몇회인가요?");
		int raceCount = sc.nextInt();

		List<RacingCar> cars = RacingCarGenerator.createCars(carData);

		for (int i = 0; i < raceCount; i++) {
			for (RacingCar car : cars) {
				car.move(RandomNumGenerator.createNumZeroToNine());
				car.print();
			}
			System.out.println();
		}
	}
}
