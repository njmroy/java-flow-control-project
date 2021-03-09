
public class AsciiChars
{
    public static void printNumbers() 
    {
        String nums = "0123456789";
        for (int i=0;i<nums.length(); i++)
        {
            System.out.println(nums.charAt(i));
        }

    }
    
    public static void printLowerCase() 
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<chars.length(); i++)
        {
            System.out.println(chars.charAt(i));
        }
    }
    
    public static void printUpperCase()
    {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<chars.length(); i++)
        {
            System.out.println(chars.charAt(i));}
            
        }
        
 
}
