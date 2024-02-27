package one_to_many_usng_lazyinstaniation;

public class Tyre {
private String brand;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public Tyre(String brand) {
setBrand(brand);
}

}
