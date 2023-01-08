/*WAP to format the following letter using escape sequence characters.
        Letter = “Dear Sir, This Java Course is nice. Thanks”   */
class ques36 
{
    public static void main(String[] args) 
    {
        String letter,myletter;
        letter = "Dear Sir, This Java Course is nice. Thanks";
        myletter="Dear Sir,\n\tThis Java Course is nice.\nThanks";
        System.out.println("Original letter is:"+letter);
        System.out.println("New letter after using escape sequence character is:\n"+myletter);
        
    }   
}
