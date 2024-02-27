package one_to_many_usng_instanceIntialization;

public class Test {
public static void main(String[] args) {
	Bank b=new Bank("SBI", "SBI1122");
	System.out.println("bank details");
	System.out.println(b.getName()+b.getIfsc());
	
	for (int i = 0; i <b.getAccounts().length; i++) {
		System.out.println(b.getAccounts()[i].getName());
	}
	
}
}
