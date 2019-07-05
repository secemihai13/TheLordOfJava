
public abstract class Creature implements Comparable<Creature>, ICreature {
	
	private Abilities abilities;
	private String nickName;
	private long score;
	
	public Creature(double stamina, double speed, int agility, String nickname, long score) {
		this.abilities = new Abilities(stamina, speed, agility);
		this.nickName = nickname;
		this.score = score;
	}
	
	@Override
	public String getNickname() {
		return this.nickName;
	}
	@Override
	public void setNickname(String nickname) {
		this.nickName = nickname;
	}
	@Override
	public void updateScore(long amount) throws NumberFormatException {
		if(amount < 0) {
			throw new NumberFormatException("Expecting positive bonus value, got: " + amount);
		}
		this.score += amount;
	}
	
	@Override
	public void powerUp(double stamina, double speed, int agility) {
		this.abilities.update(stamina, speed, agility);
	}
	
	@Override
	public int compareTo(Creature other) {
		return this.abilities.compareTo(other.abilities);
	}
	
	public String toString() {
		return "NickName: " + this.nickName + "\n" + "Score: " + this.score + "\n" + "Abilities: " + this.abilities;
	}
	
}
