// Program to open notepad through command with vs code.
class Notepad
{
    public static void main(String[] args) 
    {
        Runtime rn=Runtime.getRuntime();
        try
        {
            rn.exec("notepad");
        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}