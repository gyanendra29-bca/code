// Program which ask for an integer from the users and it reverse the integer and print the reversed number.
import java.util.*;
public class ques41
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        int a,n=0;
        while(num!=0)
        {
            n=n*10;
            a=num%10;
            n=n+a;
            num/=10;  
        }
        System.out.println("Reversed number is:"+n);
    }
}
