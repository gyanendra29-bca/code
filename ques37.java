/* WAP to fill in a letter template which looks like below: 
                letter="Dear <|name|>,Thanks a lot"
                Replace=<|name|> with a string (some name)   */
import java.util.*;
class ques37 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        String str=sc.nextLine();  
        String letter="Dear <|name|>,Thanks a lot";
        String replace=letter.replace("<|name|>",str);
        System.out.println("Original letter is : \"Dear <|name|>,Thanks a lot\"");
        System.out.println("Letter after replacing <|name|> with some name is :"+replace);
    }   
}
