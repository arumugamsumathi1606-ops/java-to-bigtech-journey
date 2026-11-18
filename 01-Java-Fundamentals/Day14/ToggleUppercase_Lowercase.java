public class ToggleUppercase_Lowercase {
    public static void main(String[] args) {
        String s = "I Am leArNing CoDinG";
      //  StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
           char ch = s.charAt(i);
         String result = " ";
            if (Character.isUpperCase(ch))
            {
result = result + Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch))
            {
              result = result + Character.toUpperCase(ch);
            }
            System.out.print(result);
        }
    }
}
