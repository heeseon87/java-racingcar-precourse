package cargame;

public class RandomEnergyGeneratorPolicy implements EnergyGeneratorPolicy {

	@Override
	public int generate() {
		return (int)(Math.random() * 10);
	}
}
