package cargame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RandomNumGeneratorTest {

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
	void 영에서_구사이의_난수_생성(int randomNum) {
		assertThat(randomNum).isBetween(0, 9);
		assertThat(RandomNumGenerator.createNumZeroToNine()).isBetween(0, 9);
	}
}
