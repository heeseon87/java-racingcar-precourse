package cargame;

public class RacingCar {

	private String name;

	public RacingCar(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5글자 이하여야 합니다.");
		}

		this.name = name;
	}

	public String getName() {
		return name;
	}
}
