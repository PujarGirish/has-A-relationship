package practicehasarelatioship;

// one to one
public class Engine {
private int hp;

public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public Engine(int hp) {
	setHp(hp);
}

}
