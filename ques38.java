//WAP to convert a string to lowercase.
import java.util.*;
class ques38
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        System.out.println("Original string "+str+" to lowercase is: "+str1);   
    }
}