package playingwithobjects;

public class Tets {
	public static void main(String[] args) {
		Bottle b = new Bottle();
		b.setColour("Blue").setCost(80);// method chaining

		System.out.println(b.getColour());
		System.out.println(b.getCost());

	}
}
