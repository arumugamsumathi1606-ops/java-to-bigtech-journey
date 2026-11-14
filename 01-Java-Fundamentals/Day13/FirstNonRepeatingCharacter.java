import java.util.HashMap;

public class FirstNonRepeatingCharacter {
      public static void main(String[] args) {
        String str = "swiss";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
System.out.println(map);

 for(int i=0; i<str.length(); i++)
        {
            char ch2 = str.charAt(i);
            if(map.get(ch2)==1)
            {
                System.out.println("First non-repeating character is: " + ch2);
                break;
            }
      }
}
}