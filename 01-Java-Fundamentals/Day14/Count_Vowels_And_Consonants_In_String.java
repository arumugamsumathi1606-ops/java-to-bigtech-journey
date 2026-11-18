public class Count_Vowels_And_Consonants_In_String {
public static void main(String[] args)
{
    int vowels = 0;
    int consonants = 0;
    String str = "I Love DSA and JAVA";

    for(int i=0 ; i<str.length() ; i++)
    {
        char ch = str.charAt(i);
        ch = Character.toLowerCase(ch);
        if(ch =='a' || ch =='e' || ch =='i' || ch =='0' || ch =='u')
        {
           vowels++;
        }
       else if (Character.isLetter(ch)) {
    consonants++;
} 
        }
        System.out.println("Vowels are : " + vowels);
    System.out.println("Consonants are : " +consonants);
            }
  }
