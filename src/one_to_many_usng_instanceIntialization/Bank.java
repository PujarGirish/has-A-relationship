package one_to_many_usng_instanceIntialization;

public class Bank {
	private String name;
	private String ifsc;
private Account accounts[]= { new Account("kashish"),
		new Account("krsihna"),new Account("kumar")};
public String getName() {
	return name;
}
public Bank(String name, String ifsc) {
	this.name = name;
	this.ifsc = ifsc;
}
public void setName(String name) {
	this.name = name;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public Account[] getAccounts() {
	return accounts;
}



}

