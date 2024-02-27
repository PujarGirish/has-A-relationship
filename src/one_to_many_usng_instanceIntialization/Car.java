package one_to_many_usng_instanceIntialization;

public class Car {
	// car HAS A tyres
	//using early instantiation
private Tyre []tyres= {new Tyre("appolo"),
		new Tyre("MRF"),new Tyre("goodyear"),new Tyre("bridgestone")};

public Tyre[] getTyres() {
	return tyres;
}


}
