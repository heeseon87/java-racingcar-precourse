package cargame;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class RacingCarListTest {

	@Test
	void 자동차_이름을_콤마로_구분해서_목록에_추가() {
		// given
		String carData = "chico,coco,jamie";

		// when
		RacingCarList racingCars = RacingCarList.attend(carData);

		// then
		assertThat(racingCars.size()).isEqualTo(3);
	}

}
