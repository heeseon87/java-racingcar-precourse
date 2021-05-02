package cargame;

import java.util.ArrayList;
import java.util.List;

public class Score {

	private final List<RacingCar> winners;
	private RacingCar winner;

	public Score() {
		this.winners = new ArrayList<>();
		this.winner = new RacingCar("ghost");
	}

	public void calcWinner(RacingCarList racingCarList) {
		for (RacingCar car : racingCarList.getRacingCars()) {
			recordWinner(car);
		}
	}

	private void recordWinner(RacingCar car) {
		newRecord(car);
		coWin(car);
	}

	private void coWin(RacingCar car) {
		if (car.isMe(winner)) {
			return;
		}

		if (!car.isFasterOrEqualTo(winner)) {
			return;
		}

		winners.add(car);
	}

	private void newRecord(RacingCar car) {
		if (!car.isFasterThan(winner)) {
			return;
		}

		winners.clear();
		winners.add(car);
		winner = car;
	}

	public List<RacingCar> getWinners() {
		return winners;
	}
}
