public class CountWordsInASentence {
 public static void main(String[] args) {
    String str = "I love learning Java";
   // for (int i=0; i<str.length() ; i++)
    {
//har ch = str.charAt(i);
String[] words = str.split(" ");
System.out.print(words.length); 
    }
        
 }
}
