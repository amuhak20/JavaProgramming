package CommonPrograms;

public class ReverseWords {
    public static void main(String[] args) {
        
    
String str = "I love Java";
String[] word = str.split("\\s");
String reversedWord = " ";
System.out.println(word.length);
for(int i=0; i<word.length;i++)
{
System.out.println(word[i].length());
    for(int j=word[i].length()-1; j>=0; j--)
    {
        reversedWord = reversedWord + word[i].charAt(j);
    }
    System.out.print(reversedWord + " ");;
    reversedWord = " ";
}
}
}
