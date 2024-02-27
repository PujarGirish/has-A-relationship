package has_A_relationship_using_earltInsatantiation_Intiliazer;

public class Car {
	private String modelname;

	private Engine e = new Engine(1200);

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public Engine getEngine() {
		return e;
	}

	public Car() {

	}
	public Car(String modelname)
	{
		setModelname(modelname);
	}
	
}
