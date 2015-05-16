package day15;

public class MethodOverloading {

	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void  sum(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void sum(String a,String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		sum(10,20);
		sum(10.56,45.78);
        sum("Hello ","friends");
	}

}
