package day21;

public class Audi extends Car {

	String model;
	public void accelerate()
	{
		System.out.println("This is to accelerate");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="Audi";
		a.accelerate();
		a.price=1111;
		a.start();
		
		

	}

}







