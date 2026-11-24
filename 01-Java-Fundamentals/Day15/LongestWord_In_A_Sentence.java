public class LongestWord_In_A_Sentence
{    public static void main(String[]  args)
    {
String str = "I love learning Java programming";
String longestWord = " ";
int maxLength = 0;

  String Words[]= str.split(" ");

for (int i=0; i<Words.length; i++)
{
  
    String currentWord = Words[i];

    if (currentWord.length() > maxLength)
    {
maxLength = currentWord.length();
longestWord = currentWord;
    }
System.out.println(longestWord );
System.out.println( maxLength);
}
System.out.println("The longestWord is " + longestWord + " and the MaxLength is " + maxLength);
    }
}