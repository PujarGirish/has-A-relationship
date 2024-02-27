package practicehasarelatioship;

public class cars {
private Tyres []tyres=new Tyres[4];
int i=0;
void add(Tyres tyres)
{
	if (i<this.tyres.length) {
		this.tyres[i++]=tyres;
		
	}
	else
	{
		System.out.println("inavlid tyre ");
	}
}

public Tyres[] getTyres() {
	return tyres;
}



}
