import java.util.HashMap;
public class RansomNote {
    public static void main(String[] args) {
        String magazine = "aab";
        String ransomNote = "aa";
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
         for(int j = 0; j < ransomNote.length(); j++) {
    char c1 = ransomNote.charAt(j);

    int count = magazineMap.getOrDefault(c1, 0);

    if(count == 0) {
        System.out.println(false);
        return;
    }

 magazineMap.put(c1, count - 1);
}

// All required characters are available
System.out.println(true);

}
}