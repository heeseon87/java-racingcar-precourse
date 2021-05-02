package cargame;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ScoreTest {

	@Test
	void chico_우승_시나리오() {
		// given
		RacingCarList racingCarList = RacingCarList.attend("chico,coco,jamie");
		List<RacingCar> racingCars = racingCarList.getRacingCars();

		RacingCar chico = racingCars.get(0);
		RacingCar coco = racingCars.get(1);
		RacingCar jamie = racingCars.get(2);

		chico.setLocation("------");
		coco.setLocation("---");
		jamie.setLocation("----");

		// when
		Score score = new Score();
		score.calcWinner(racingCarList);

		// then
		assertThat(score.getWinners()).doesNotContain(coco);
		assertThat(score.getWinners()).doesNotContain(jamie);
		assertThat(score.getWinners()).contains(chico);
	}

	@Test
	void chico_coco_공동_우승_시나리오() {
		// given
		RacingCarList racingCarList = RacingCarList.attend("chico,coco,jamie");
		List<RacingCar> racingCars = racingCarList.getRacingCars();

		RacingCar chico = racingCars.get(0);
		RacingCar coco = racingCars.get(1);
		RacingCar jamie = racingCars.get(2);

		chico.setLocation("------");
		coco.setLocation("------");
		jamie.setLocation("----");

		// when
		Score score = new Score();
		score.calcWinner(racingCarList);

		// then
		assertThat(score.getWinners()).doesNotContain(jamie);
		assertThat(score.getWinners()).contains(chico);
		assertThat(score.getWinners()).contains(coco);
	}
}