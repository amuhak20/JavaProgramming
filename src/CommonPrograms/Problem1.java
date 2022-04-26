package CommonPrograms;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    
   static List<String> al = new ArrayList<String>();
public void addArrayList(String str)
{
    al.add(str);
    
    
}
public static boolean isNumeric(String str)
{
    if(str == null)
    {
        return false;
    }
    
    try
    {
       double d = Double.parseDouble(str);
       
    }
    catch(NumberFormatException ex)
    {
        return false;
    }
    return true;
}

public void getArrayCount()
{
    String str= " ";
    int numCount=0, strCount=0;

    
   for(int i=0; i<al.size(); i++)
   {
       str= al.get(i);
       if(isNumeric(str))
       {
           numCount++;
       }
       else
       {
           strCount++;
       }
   }
   System.out.println("The count of number is: "+numCount+ " and string count is: "+strCount);
}

void getArraySizeAndRemove()
{
    int smallest = Integer.MIN_VALUE;
    int largest = Integer.MIN_VALUE;
    int pos=0, lpos=0;
    for(int i=0; i<al.size(); i++)
    {
        smallest= al.get(i).length();
        
        if(al.get(i).length()<smallest)
        {
            smallest=al.get(i).length();
            pos =i;
        }
        else if(al.get(i).length()>largest)
        {
            largest=al.get(i).length();
            lpos=i;
        }
       
    } 
    System.out.println("Smallest is at " +smallest+"th place"+ pos+  " largest: "+largest+ "at pace"+lpos);
    al.remove(pos);
    al.remove(lpos);
}
public static void main(String[] args) {
    Problem1 pr = new Problem1();
    pr.addArrayList("123");
    pr.addArrayList("test");
    pr.addArrayList("test123");
    pr.addArrayList("testing");
    pr.addArrayList("435");
    System.out.println("Original arrays elements" +al);
    pr.getArrayCount();
    pr.getArraySizeAndRemove();
    System.out.println("Original arrays elements after removing large and small elements" +al);


    
}
}
