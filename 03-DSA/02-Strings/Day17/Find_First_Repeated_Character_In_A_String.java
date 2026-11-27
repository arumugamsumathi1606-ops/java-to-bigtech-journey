
import java.util.HashSet;

public class Find_First_Repeated_Character_In_A_String {
    public static void main(String[] args)
    {
         HashSet<Character> set = new HashSet<>();
        String str = "programming";
      
        for(int i=0;i<str.length(); i++)
        {
            char ch = str.charAt(i); // take char by char
if(set.contains(ch)) //if 'r' contains again
{
System.out.println("The Repeated Characters are  : " + set);
System.out.println("The First Repeated Char is  : " + ch);
break;
}
else{
    set.add(ch); //catch that 'r' alone as repeated

}  }      
        
    }
    
}