import java.util.*;
class ques40 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        String s=str.replace(' ', '_');
        System.out.println("Original string :"+str);
        System.out.println("New string spaces repalced with underscore :"+s);   
    }
}
