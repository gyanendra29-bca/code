//WAP to print the elements of an array.
import java.util.*;
public class aques11 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array length:");
      int n=sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the array element:");
      //loop to intialize array element
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      //loop to print the array element
      System.out.println("Array elements are : ");
      for(int i=0;i<n;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
}
