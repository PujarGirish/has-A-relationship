package one_to_many_usng_instanceIntialization;

public class Employes {
private String name;
private int id;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}

public Employes(String name,int id) {
	setName(name);
	setid(id);
}

}
