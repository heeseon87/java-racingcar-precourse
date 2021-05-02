package cargame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RacingCarTest {

	@Test
	void 이름이_다섯글자_이하인_자동차_생성() {
		// when
		RacingCar car = new RacingCar("chico");

		// then
		assertThat(car.getName().length()).isLessThanOrEqualTo(5);
	}

	@ParameterizedTest
	@CsvSource(value = {"0:false", "1:false", "2:false", "3:false", "4:true", "5:true", "6:true", "7:true", "8:true", "9:true"}, delimiter = ':')
	void 생성한_난수가_4_이상인_경우에만_한번_이동(int num, boolean expected) {
		// given
		RacingCar car = new RacingCar("chico");

		// when
		boolean isMove = car.move(num);

		// then
		assertThat(isMove).isEqualTo(expected);
	}
}
