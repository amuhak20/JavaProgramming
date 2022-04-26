package CommonPrograms;

import java.util.Arrays;

public class RotateArray {
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    int temp;
    //int last =arr[arr.length-1];
    
    for(int i=0; i<2; i++)
    {
        temp = arr[0];
        for(int k=0; k<arr.length-1; k++)
        {
            arr[k] = arr[k+1];
            
            
        }
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1]=temp;
        //arr[0]=last;
        
        
    }
    
    for(int j=0; j<arr.length; j++)
    {
        System.out.println(arr[j]);
    }
}
}
