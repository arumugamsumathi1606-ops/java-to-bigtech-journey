public class ReverseString {
     public static void main (String[] args)
     {
        String str = "Hello, World";
        String reversed = "";
        for(int i=str.length()-1 ; i>=0 ; i--)
        {
            //0 = 0 + hello
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);

     }
}

//Without using StringBuilder or StringBuffer, we can reverse a string by iterating through the string from the end to the beginning and concatenating each character to a new string. In this code, we initialize an empty string `reversed` and use a for loop to traverse the original string `str` in reverse order. Each character is added to the `reversed` string, and finally, we print the reversed string.
// String str = "JAVA";

// for (int i = str.length() - 1; i >= 0; i--) {
//     System.out.print(str.charAt(i));
// }