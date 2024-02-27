package one_to_many_usng_instanceIntialization;

public class Account {
private String name;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;

}
public Account(String name) {
setName(name);
}



}
