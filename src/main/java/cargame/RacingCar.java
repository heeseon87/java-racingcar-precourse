package cargame;

public class RacingCar {

	private String name;
	private String location;

	public RacingCar(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5글자 이하여야 합니다.");
		}

		this.name = name;
		this.location = "";
	}

	public String getName() {
		return name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void print() {
		System.out.printf("%-5s: %s\n", name, location);
	}

	public boolean move(Energy energy) {
		if (!energy.isEnough()) {
			return false;
		}

		location += "-";
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RacingCar)) {
			return false;
		}

		RacingCar objCar = (RacingCar)obj;
		return this.name.equals(objCar.name);
	}

	public boolean isMe(RacingCar winner) {
		return this.equals(winner);
	}

	public boolean isFasterThan(RacingCar winner) {
		return location.length() > winner.location.length();
	}

	public boolean isFasterOrEqualTo(RacingCar winner) {
		return location.length() == winner.location.length();
	}
}
