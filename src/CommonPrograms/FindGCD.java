package CommonPrograms;

public class FindGCD {
public static void main(String[] args) {
	int x = 5, y = 10;
	int gcd = 0;
	int i=0;
	for(i=2; i<=x && i<=y; i++) {
		if(x%i == 0 && y%i == 0) {
			gcd=i;
			
		}
		//System.out.println("The GCD of x & y is: " +gcd);
	}
	System.out.println("The GCD of x & y is: " +gcd);
}
}
