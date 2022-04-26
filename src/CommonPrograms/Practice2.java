package CommonPrograms;

public class Practice2 {
public static void main(String[] args) {
    int temp=0;
    int arr[]= {23,45,63,13,5};
    for(int i=0; i<arr.length; i++)
    {
    System.out.println("elements of array:" +arr[i]);
    }
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j+1];
                arr[j+1] =arr[j];
                arr[j]=temp;
            }
        }
    }
    
    for(int i=0; i<arr.length; i++)
    {
    System.out.print("elements of array:" +arr[i]);
    }
}
}
