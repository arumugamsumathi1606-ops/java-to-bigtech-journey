public class String_Rotation {
    public static void main ( String[] args)
    {
String str1 = "ABCD";
String str2 = "CDAB";


    
            if(str1.length() == str2.length())
            {
                String str3 = str1 + str1;
                if(str3.contains(str2))
                {
                    System.out.println("The str1 and str2 are String Rotation");
                }
                
                 else 
                {
                  System.out.println("Not Rotation");
                }
            }
            else{
                System.out.println("The both strings are not equal");
            
        }
    }
}