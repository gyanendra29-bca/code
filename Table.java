//Program to print the multiplication table of n.
import java.util.*;
class Table 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n=sc.nextInt();
        System.out.printf("Multiplication table of %d is:\n",n);
        int mul;
        for(int i=1;i<=10;i++) 
        {
            mul=n*i;
            System.out.println(n+" * "+i+" = "+mul);
        } 
    }
}
