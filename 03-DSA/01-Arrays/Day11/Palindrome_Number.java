public class Palindrome_Number {
    public static void main(String[] args)
    {
        int x =-121;
        //Negative numbers are not palindrome
       
        //calc Negative numbers are not palindrome
        
        if (x < 0)
        {
            System.out.println("Negative numbers are not palindrome");
           return;
        }
         int original = x;
        int revered = 0;
        if (x > 0)
        {
            int remainder = x % 10; //1
            revered = revered * 10 + remainder; //1 * 10 + 2 = 12
            x = x / 10; // 12 / 10 = 1
         //  return;
                    
        }
        if (original == revered)
        {
            System.out.println(original + " Number is palindrome");
           // return;
        }
        else
        {
            System.out.println(original + " Number is not palindrome");
           // return;
        }
       // System.out.println("Revered number is: " + revered);
        
    }
    
}