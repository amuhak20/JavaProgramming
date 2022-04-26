package CommonPrograms;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter numer");
   int num = sc.nextInt();
   
   if(num %4 ==0)
   {
       System.out.println("Year is leap");
   }
   sc.close();
}
}
