//Find 3rd Largest Number in an Array
import java.util.*;
public class aques20 
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
        //loop to Sort the array in descending order    
        for(int i=0;i<n;i++) 
        {     
            for(int j=i+1;j<arr.length;j++) 
            {     
               if(arr[i]<arr[j]) 
               {    
                   temp=arr[i];    
                   arr[i]=arr[j];    
                   arr[j]=temp;    
               }     
            }     
        }    
        System.out.println("Third largest elements of array is : ");
        System.out.println(arr[2]);
    }
}
