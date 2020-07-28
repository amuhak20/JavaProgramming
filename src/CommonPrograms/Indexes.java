package CommonPrograms;

import java.util.Arrays;

public class Indexes {
public static void main(String[] args) {
	String str= "HelloWorld every one. But World is not that great today. Greeting HelloWorld doesn't make any sense";
	char[] charArray = str.toCharArray();
	int indexH=0;
	int indexW=0;
	int a[] = new int[4];
	int b[] = new int[4];
	int countA=0;
	int countB=0;

	
	
	
	  for(int i=0; i<charArray.length; i++) 
	  { 
		  if(charArray[i]=='H') 
		  { 
			  indexH=i;
			  a[countA]=i;
			  countA++;
	 // System.out.println(indexH); 
	  } 
		  else if(charArray[i]=='W') 
		  { 
			 indexW=i;
			 a[countB]=i;
			  countB++;
	  } 
	  
	  }
	 
	
	//Arrays.sort(a);
	//Arrays.sort(b);
	for(int i=0; i<a.length; i++)
	{
System.out.print(a[i]+ ",");
		
	}
	System.out.println();
	for(int i=0; i<b.length; i++)
	{
System.out.print(b[i] + ",");
		
	}

}
}
