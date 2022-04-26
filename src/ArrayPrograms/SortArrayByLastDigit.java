package ArrayPrograms;

public class SortArrayByLastDigit {
public static void main(String[] args) {
	int a[]= {115, 110, 123, 651};
	int temp=0;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
		
		if(a[i]%10 > a[j]%10)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		}
		
	}
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
		
	}
}
}
