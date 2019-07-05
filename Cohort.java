import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cohort<C extends Creature> {
	
	private Map<String, C> map;
	
	public Cohort() {
		this.map = new HashMap<>();
	}
	
	public int size() {
		return this.map.size();
	}
	
	public C getCitizenAt(String address) {
		return this.map.get(address);
	}
	
	public boolean isEmpty() {
		if(this.map.size() == 0) {
			return true;
		}
		return false;
	}
	
	public void addNewCitizen(String address, C creature) {
		this.map.put(address, creature);
	}
	
	public ArrayList<C> getAllCitizensToFight() {
		ArrayList<C> list = new ArrayList<>(this.map.values()); 
		Collections.sort(list);
		return list;
	}
	
	public String toString() {
		ArrayList<C> list = new ArrayList<>(this.map.values()); 
		Collections.sort(list);
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < list.size(); i++) {
			str.append(list.get(i).toString() + "\n");
		}
		return str.toString();
	}

}
