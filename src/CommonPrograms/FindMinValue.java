package CommonPrograms;

public class FindMinValue {
int minvlue()
{
	int[] A = new int[]{23, 44, 55, 6, 7, 2};
	int min = Integer.MIN_VALUE;
	for(int i=0; i<A.length; i++)
	{
		for(int j=0; j<A.length; j++)
		{
		if(A[i] < A[j])
		{
			min = A[i];
		}
		}
	}
	return min;
	
}
public static void main(String[] args) {
	FindMinValue fm = new FindMinValue();
	System.out.println(fm.minvlue());
}
}
