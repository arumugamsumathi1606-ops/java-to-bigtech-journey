import java.util.HashMap;
public class AnagramsUsing1HM {
      public static void main(String[] args)
    {
        String s1 = "listen";
        String s2 = "silent";
        HashMap<Character, Integer> map = new HashMap<>();
       
if(s1.length() != s2.length())
{
    System.out.println("Not Anagrams"); return;
}
        //1st for loop. Check length of both strings. If not equal then not anagrams
 for(int i=0; i<s1.length(); i++)
        {
            char ch1 = s1.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
}   // Reduce counts using second String
 for(int i=0; i<s2.length(); i++)
        {
            char ch2 = s2.charAt(i);
            //character count should be present in map. If not then not anagrams
           int character = map.getOrDefault(ch2, 0);
           //if that charadcte risnt present then not anagran else part is now easy
           if(character == 0)
           {
            System.out.println("Not Anagrams"); return;
           }
           else
           {
            map.put(ch2, character - 1); 
           }
           
        }
         System.out.println("Anagrams");
       
    }
}
          