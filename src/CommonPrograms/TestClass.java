package CommonPrograms;

public class TestClass {
@SuppressWarnings("finally")
static boolean test()
{
	boolean test =false;
	try {
		int i=1;
		int sum =i/0;
		System.out.println(sum);
	}
	catch(Exception ex)
	{
		System.out.println("In catch block");
		return test;
	}
	finally
	{
		System.out.println("In finally block");
		return test;
	}
}
public static void main(String[] args) {
	System.out.println(test());
	System.out.println(10+20+ "Java");
	System.out.println( "Java"+10+20);
	System.out.println(10*20+ "Java");
}
}
