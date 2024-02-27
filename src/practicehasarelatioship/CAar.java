package practicehasarelatioship;

public class CAar {
	private String name;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public CAar(String name)
	{
		this.name=name;
	}
private Engine engine=new Engine(1345);


}
