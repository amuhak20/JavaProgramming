package CommonPrograms;

public class PrintAlternaterChars {
public static void main(String[] args) {
    String str= "Java is awesome";
    String temp="";
    
    for(int i=0; i<=str.length(); i=i+2)
    {
        if(str.charAt(i)!=' ')
            temp=temp+str.charAt(i);
        
    }
    
  
    System.out.println(temp);
}
}
