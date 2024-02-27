package one_to_many_usng_instanceIntialization;

public class cardriver {
public static void main(String[] args) {
	Car c1=new Car();
	for (int i = 0; i <c1.getTyres().length; i++) {
	System.out.println(c1.getTyres()[i].getBrand());	
	}
 	
}
}
