package cargame;

public class CustomEnergyGeneratorPolicy implements EnergyGeneratorPolicy {

	private int value;

	public CustomEnergyGeneratorPolicy(int value) {
		this.value = value;
	}

	@Override
	public int generate() {
		return value;
	}
}
