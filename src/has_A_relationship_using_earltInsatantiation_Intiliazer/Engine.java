package has_A_relationship_using_earltInsatantiation_Intiliazer;

public class Engine {
	private double hp;

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public Engine() {
	}

	public Engine(double hp) {
     setHp(hp);
	}
}
