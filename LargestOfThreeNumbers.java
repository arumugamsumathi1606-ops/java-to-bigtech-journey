public class LargestOfThreeNumbers {
    public static void main(String[] args)
    {
        int a = 15;
        int b = 25;
        int c = 10;

        if(a>b && a>c)
        {
            System.out.println("The largest number is: " + a);
        }
        else if(b>a && b>c)
        {
            System.out.println("The largest number is: " + b);
        }
        else if(c>a && c>b)
        {
            System.out.println("The largest number is: " + c);
        }
        else
        {
            System.out.println("All numbers are equal");
        }
    }
    
    
}
