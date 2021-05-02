package cargame;

public class CustomEnergyPolicy implements EnergyGeneratorPolicy {

	private int value;

	public CustomEnergyPolicy(int value) {
		this.value = value;
	}

	@Override
	public int generate() {
		return value;
	}
}
