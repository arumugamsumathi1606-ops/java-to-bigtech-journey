public class ReverseWords {
    public static void main(String[] args) {
        String s = "I am learning coding";
        //reverses all characters
//     for(int i=s.length()-1 ; i>=0; i--)
//     {
//         char ch = s.charAt(i);
// System.out.print(ch);
// return;
 String[] words = s.split(" ");
for(int i=words.length-1 ; i>=0; i--)
{
       System.out.print(words[i] + " ");
}
 
    }    

}