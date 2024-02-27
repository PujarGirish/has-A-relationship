package one_to_many_usng_lazyinstaniation;

public class Car {
	
	private Tyre tyres[] = new Tyre[4];
	// a variable for index to get incremented
   int i=0;
   //helper method which adds the tyre object
	void add(Tyre tyress)
	{
		if (i<tyres.length) {
			tyres[i++]=tyress;
		}
		else
		{
			System.err.println("hey u fool car has only 4 wheels");
		}
		
	}
	public Tyre[] getTyres() {
		return tyres;
	}
	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}
	
	
}
