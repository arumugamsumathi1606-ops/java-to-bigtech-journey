import java.util.HashMap;
public class Count_Frequency_of_each_character_in_a_String_using_HashMap {
    public static void main(String[] args)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "programming";
        for(int i=0; i< str.length();i++)
        {
char ch = str.charAt(i);
map.put(ch, map.getOrDefault(ch, 0) + 1 );

        }
        System.out.println(map);

    }
}