public class Java_String_Compression {
    public static void main(String[] args)
    {
        String str = "aaabbbaa";
        StringBuilder result = new StringBuilder();
        char current_character = str.charAt(0); // first char = a
          int count = 1; //a=1
       
         for (int i=1; i<str.length();i++)
        {
        //Compare the current char vs count
        if(current_character == str.charAt(i))
        {
            count++;
        } 
        else {
result.append(current_character).append(count);
current_character = str.charAt(i); // repeat the process for B
count=1; //b count starts directly with 1
        }
                    
             }
             result.append(current_character).append(count); // line execute output correctly else a3b3 only. Again a wont execute 
             System.out.println(result);
          
    }
}