package cargame;

public class Energy {

	private int value;

	private Energy(int value) {
		if (value < 0 || value > 9) {
			throw new IllegalArgumentException("연료 값은 0부터 9까지 입니다.");
		}

		this.value = value;
	}

	public static Energy createEnergy(EnergyGeneratorPolicy energyGeneratorPolicy) {
		return new Energy(energyGeneratorPolicy.generate());
	}

	public int getValue() {
		return value;
	}

	public boolean isEnough() {
		return value >= 4;
	}
}
