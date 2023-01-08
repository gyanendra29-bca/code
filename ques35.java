//WAP to detect double and triple spaces in a string.
import java.util.*;
class ques35 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length()-2;i++)
        {
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);
            char ch3=str.charAt(i+2);
            if((ch1==' '&&ch2==' ')||(ch1==' '&&ch2==' '&&ch3==' '))
                count++;
        } 
        System.out.println("Total no. of double and triple spaces in string are: "+count);  
    }
}
