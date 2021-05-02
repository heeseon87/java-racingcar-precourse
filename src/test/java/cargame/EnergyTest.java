package cargame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EnergyTest {

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
	void 영에서_구_사이의_연료_생성(int randomNum) {
		assertThat(randomNum).isBetween(0, 9);
		assertThat(Energy.createEnergy(new RandomEnergyGeneratorPolicy()).getValue()).isBetween(0, 9);
	}

	@ParameterizedTest
	@ValueSource(ints = {-1, 10, 100, 1000})
	void 연료_생성_실패(int randomNum) {
		assertThatIllegalArgumentException()
			.isThrownBy(() -> Energy.createEnergy(new CustomEnergyGeneratorPolicy(randomNum)))
			.withMessage("연료 값은 0부터 9까지 입니다.");
	}
}
