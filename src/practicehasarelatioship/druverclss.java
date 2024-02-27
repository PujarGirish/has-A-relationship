package practicehasarelatioship;

public class druverclss {
public static void main(String[] args) {
	cars c=new cars();
	c.add(new Tyres("mrf"));
	c.add(new Tyres("appolo"));
	c.add(new Tyres("tvS"));
	c.add(new Tyres("CEAT"));
	
	for (int i = 0; i <c.getTyres().length;i++) {
		System.out.println(c.getTyres()[i].getBrand());
	}
}
}
