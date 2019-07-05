import java.util.ArrayList;

public class LordOfJava {

	private Parameters parameters;
	private Cohort<Dragon> dragons = new Cohort<>();
	private Cohort<Warg> wargs = new Cohort<>();
	private Cohort<Mumakil> mumakils = new Cohort<>();

	public LordOfJava(String OS, String gamePATH, String credentials, int noLives) {
		this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
	}

	public void addCreature(Creature creature, String address) throws IllegalArgumentException {
		if(creature instanceof Dragon) {
			this.dragons.addNewCitizen(address, (Dragon) creature);
		} else if(creature instanceof Warg) {
			this.wargs.addNewCitizen(address, (Warg) creature);
		} else if(creature instanceof Mumakil) {
			this.mumakils.addNewCitizen(address, (Mumakil) creature);
		} else {
			throw new IllegalArgumentException("Creature type unknown: " + creature.getClass().getName());
		}
	}

	public int battleDragonsWargs() {
		int result = 0;
		if(this.dragons.size() > this.wargs.size()) {
			return 1;
		}
		if(this.dragons.size() < this.wargs.size()) {
			return -1;
		}
		ArrayList<Dragon> dragons = this.dragons.getAllCitizensToFight();
		ArrayList<Warg> wargs = this.wargs.getAllCitizensToFight();

		for(int i = 0; i < this.dragons.size(); i++) {
			result += dragons.get(i).compareTo(wargs.get(i));
		}
		return result;
		
	}
	
	public String toString() {
		return this.parameters.toString() + "\n" + this.dragons.toString() + "\n" + this.wargs.toString() + "\n" + this.mumakils.toString();
	}

}










