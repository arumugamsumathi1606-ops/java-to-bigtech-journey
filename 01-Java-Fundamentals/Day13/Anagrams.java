import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args)
    {
        String s1 = "listen";
        String s2 = "silentrf";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        //1st for loop
        for(int i=0; i<s1.length(); i++)
        {
char ch1 = s1.charAt(i);
map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
        }
        //2nd for loop
         for(int i=0; i<s2.length(); i++)
        {
            char ch2 = s2.charAt(i);
            //check the ch2 char count. if exists anagram else not
          map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }
        if(map1.equals(map2))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}

