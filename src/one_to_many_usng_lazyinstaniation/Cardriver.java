package one_to_many_usng_lazyinstaniation;

public class Cardriver {
public static void main(String[] args) {
	Car c1=new Car();
	c1.add(new Tyre("appolo"));
	c1.add(new Tyre("MRF"));
	c1.add(new Tyre("CEAT"));
	c1.add(new Tyre("BRIDGESTONE"));
	for (int i = 0; i <c1.getTyres().length; i++) {
		System.out.println(c1.getTyres()[i].getBrand());
	}
}
}
