import java.util.HashSet;
public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "programming";
      //  String duplicateChars = "";
      HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) != str.lastIndexOf(ch))
            {
                duplicates.add(ch);
            }
        }
        System.out.println(duplicates);
    }
}
//Another Method to find duplicate characters in a string is by using a HashSet. In this code, we initialize an empty HashSet `duplicates` to store the duplicate characters. We iterate through each character in the string and check if its first index is different from its last index. If they are different, it means the character appears more than once in the string, and we add it to the HashSet. Finally, we print the HashSet containing the duplicate characters.
// import java.util.HashSet;

// public class DuplicateCharacter {

//     public static void main(String[] args) {

//         String str = "programming";

//         HashSet<Character> duplicates = new HashSet<>();

//         for (int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);
//             if(!duplicates.add(ch)) {
//                 // Character is a duplicate, do nothing
//             }
//         }
//         System.out.println(duplicates);
//     }
// }