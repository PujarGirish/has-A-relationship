package practicehasarelatioship;


public class Drivercalss {
public static void main(String[] args) {
	Car c=new Car();
	for (int i = 0; i <c.getTyres().length; i++) {
		System.out.println(c.getTyres()[i].getBrand());
	}
}
}
