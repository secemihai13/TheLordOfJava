
public class Dragon extends Creature implements IBurn {
	
	private double flamesPower;
	private int flySpeed;
	
	public Dragon(double stamina, double speed, int agility, String nickname, long score, double flamesPower, int flySpeed) {
		super(stamina, speed, agility, nickname, score);
		this.flamesPower = flamesPower;
		this.flySpeed = flySpeed;
	}
	
	@Override
	public void powerUp(double newStamina, double newSpeed, int newAgility) {
		super.powerUp(newStamina * 2, newSpeed / 2, newAgility * 3);
	}

	@Override
	public double getFlamesPower() {
		return this.flamesPower;
	}

	@Override
	public int getFlyingSpeed() {
		return this.flySpeed;
	}
	
	public String toString() {
		return super.toString() + "\nFlames power: " + this.flamesPower + "\nFly speed: " + this.flamesPower;
	}
	
}
