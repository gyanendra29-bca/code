/*Program to find out the type of website from the URL:
	.com – commercial website
	.org – organization website
	.in – Indian website           */
import java.util.*;

import javax.lang.model.util.ElementScanner14;    
public class Website 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the URL:");
        String str=sc.nextLine();
        if(str.endsWith(".com"))
            System.out.println("Entered URL is a commercial website");
        else if(str.endsWith(".org"))
            System.out.println("Entered URl is an orgaization website");
        else if(str.endsWith(".in"))
            System.out.println("Entered URL is an indian website");
        else   
            System.out.println("Entered URL is a some other website");
    }
}
