package one_to_many_usng_instanceIntialization;

public class EmoyesinTY {
public static void main(String[] args) {
	TestYnatra t=new TestYnatra();
	for (int i = 0; i <t.getEmp().length; i++) {
		System.out.println(t.getEmp()[i].getid()+" "+t.getEmp()[i].getName());
	}
	
	
}
}
