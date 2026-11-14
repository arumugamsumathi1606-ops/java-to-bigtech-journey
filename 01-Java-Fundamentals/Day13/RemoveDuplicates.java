import java.util.HashSet;

public class RemoveDuplicates {
      public static void main(String[] args) {
        String str = "programming";
      //  String duplicateChars = "";
    //   HashSet<Character> duplicates = new HashSet<>();
    // for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //        if(duplicates.add(ch))
    //        {
    //         System.out.println("Duplicate character is: " + ch);
    //        }

           HashSet<Character> duplicates = new HashSet<>();
           StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           if(duplicates.add(ch))
           {
            sb.append(ch);
          //  System.out.println("Duplicate character is: " + ch);
           }
}
System.out.println("String with duplicates removed: " + sb);
}
}
