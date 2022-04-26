package CommonPrograms;

public class Seperate1sand0s {
public static void main(String[] args) {
    int arr[]= {1,0,1,0,0,1,1,0};
    int left=0;
    int right=arr.length-1;
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[left]==0)
        {
            left++;
        }
        else if(arr[right]==1)
        {
            right--;
        }
        if(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }
    for(int i=0; i<arr.length; i++)
    {
        System.out.println(arr[i]);
    }
}
}
