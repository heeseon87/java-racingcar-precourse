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

	public List<RacingCar> getWinners() {
		return winners;
	}

	public void calcWinner(RacingCarList racingCarList) {
		for (RacingCar car : racingCarList.getRacingCars()) {
			recordWinner(car);
		}
	}

	// 우승자 기록
	private void recordWinner(RacingCar car) {
		newRecord(car);
		coWin(car);
	}

	// 공동 우승자 기록
	private void coWin(RacingCar car) {
		if (car.isMe(winner)) {
			return;
		}

		if (!car.isFasterOrEqualTo(winner)) {
			return;
		}

		winners.add(car);
	}

	// 단독 우승자 기록
	private void newRecord(RacingCar car) {
		if (!car.isFasterThan(winner)) {
			return;
		}

		winners.clear();
		winners.add(car);
		winner = car;
	}

	public void printWinner() {
		String winner = "";

		for (RacingCar racingCar : winners) {
			winner += racingCar.getName() + ",";
		}
		String realWinner = winner.substring(0, winner.length() - 1);

		System.out.println(realWinner + "가 최종 우승했습니다.");
	}
}
