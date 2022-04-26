package CommonPrograms;

public class PrimeNumber {
public static void main(String[] args) {
    int num=50;
    int count=0;
    for(int i=0; i<num; i++)
    {
        int temp=0;
    for(int j=2; j<i-1; j++)
    {
        if(i%j== 0)
        {
            temp=temp+1;
            break;
        }
        
    }
    if(temp>0)
    {
    
    }
    else
    {
     count++;   
        System.out.println(i);
        System.out.println(count);
    }
}
}
}
