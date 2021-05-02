package cargame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RacingCarTest {

	@Test
	void 이름이_다섯글자_이하인_자동차_생성() {
		// when
		RacingCar car = new RacingCar("chico");

		// then
		assertThat(car.getName().length()).isLessThanOrEqualTo(5);
	}
}
