package has_A_relationship_using_earltInsatantiation_Intiliazer;

public class TestDriver {
public static void main(String[] args) {
	Car c1=new Car("civic");
	System.out.println(c1.getModelname());
	System.out.println(c1.getEngine().getHp());
//	Engine e=c1.getEngine();
//	System.out.println(e.getHp());
}
}
