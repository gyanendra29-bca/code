/*- Number is series 1 1 2 3 5 8 13.....(Fibonacci series). WAP which enter the number of term and 
that many term of series should be generated and print it. */
import java.util.*;
public class ques39 
{
     public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of term:");
        int num=sc.nextInt();
        int sum=0,n1=0,n2=1;
        while(sum<=num)
        {
            System.out.print(n2+" ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }      
    }
}
