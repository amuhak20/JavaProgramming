package CommonPrograms;

public class PrintAlternateCaps {
public static void main(String[] args) {
	String str = "Java is awesome";
	String temp = " ";
	
	for(int i=0; i<str.length(); i++)
		
	{
		if (i%2==1) {
			//char c = str.charAt(i);
			char upperCase = Character.toUpperCase(str.charAt(i));
			temp = temp + upperCase;
		}
		else
		{
		temp = temp + str.charAt(i);
		}
	}
	System.out.println(temp);
}
}
