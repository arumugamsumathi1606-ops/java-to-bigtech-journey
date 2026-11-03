public class LeftStarPattern { 
     public static void main(String[]  args)
      {
        int i, j, rows=6;

        for(i=1 ; i<=rows ; i++)
        {
            for (j=1; j<=i ; j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
            }
}
//Outer loop → rows
// Inner loop → stars in each row
//Remember: Outer loop decides how many rows. Inner loop decides how many stars in each row.
//  print() keeps stars on the same line, and println() moves to the next row.