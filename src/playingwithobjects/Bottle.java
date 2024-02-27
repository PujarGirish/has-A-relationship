package playingwithobjects;

public class Bottle {
private String colour;
private int cost;
public String getColour() {
	return colour;
}
public Bottle setColour(String colour) {
	this.colour = colour;
	return this;
}
public int getCost() {
	return cost;
}
public Bottle setCost(int cost) {
	this.cost = cost;
	return this;
}
public Bottle() {
}
public Bottle(String colour, int cost) {
	this.colour = colour;
	this.cost = cost;
}

}
