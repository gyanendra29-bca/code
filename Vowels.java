//Program to count vowels,consonants,spaces and special character 
import java.util.*;
public class Vowels 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int countv=0,countc=0,counts=0,spch=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                countv++;
            }
            else if((ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='U')&&(ch>'A' && ch<='Z'))
            {
                countc++;
            }
            else if(ch==' ')    
            {
                counts++;
            } 
            else
            {
                spch++;
            } 
        }
        System.out.println("No. of vowels : "+countv);
        System.out.println("No. of consonants : "+countc);
        System.out.println("No. of spaces : "+counts);
        System.out.println("No. of special characters : "+spch);
    }
}
