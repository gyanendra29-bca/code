/*Program which force the user to enter any positive value and print it. the program should keep on 
asking the no. again until the user do not enter any negative number. */

import java.util.*;
public class ques42 
{
    public static void main(String[] args) 
    {
        int num;
       do
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number:");
            num=sc.nextInt();
            if(num>=0)
            {
                System.out.println("Number is:"+num);
                continue;
            }
        }while(num>=0);
    }        
}
