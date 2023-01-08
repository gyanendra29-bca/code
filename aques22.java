// Find 2nd Smallest Number in an Array
import java.util.*;
public class aques22 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int temp;
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop to Sort the array in ascending order    
        for(int i=0;i<n;i++) 
        {     
            for(int j=i+1;j<arr.length;j++) 
            {     
               if(arr[i]>arr[j]) 
               {    
                   temp=arr[i];    
                   arr[i]=arr[j];    
                   arr[j]=temp;    
               }     
            }     
        }    
        //loop to display the 2nd smallest element of array
        System.out.println("Second smallest number in an array is: ");
        System.out.print(arr[1]+" ");

    }       
}
