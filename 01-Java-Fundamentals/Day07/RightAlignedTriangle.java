public class RightAlignedTriangle {
    public static void main(String[] args)
    {
         int i, j, rows=6;

         for (i=1; i<=rows ; i++)
         {
            for(j=1; j<=rows - i ; j++)
                {
                    System.out.print(" ");
                }
                for(j=1 ; j<=i; j++)
                {
                    System.out.print("*");
           
         }
             System.out.println();
    }
    
}
}
