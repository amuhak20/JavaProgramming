package CommonPrograms;

public class ReverseNumber {
public static void main(String[] args) {
    int num=123;
    int rem = 0;
    while(num!=0)
    {
       int num1 = num%10;
       rem = rem*10 + num1;
       num = num/10;
    }
    
    System.out.println(rem);
}
}
