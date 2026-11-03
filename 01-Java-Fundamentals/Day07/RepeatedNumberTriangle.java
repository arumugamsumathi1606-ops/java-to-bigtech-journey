public class RepeatedNumberTriangle {
    public static void main(String[] args)
{
 int i, j, rows = 6;

 for (i=1 ; i<=rows ; i++)
 {
    for (j=1 ; j<=i ; j++)
    {
        System.out.print(i + " ");
    }
    System.out.println();
 }
    
}
}