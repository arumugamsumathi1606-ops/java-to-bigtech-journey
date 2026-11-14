import java.util.HashMap;
public class CharacterFrequency  {
    public static void main(String[] args) 
    {
        HashMap<Character, Integer> map = new HashMap<>(); 
        String str = "programming";
         
         for (int i=0; i< str.length() ; i++)
         {
            // Get the character at index i
            char ch = str.charAt(i);
// Update the frequency count in the map
            map.put(ch, map.getOrDefault(ch, 0) + 1);

         }
         System.out.println(map);
    }
    
}
