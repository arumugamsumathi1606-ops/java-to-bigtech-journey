public class Second_Largest_Element {
    public static void main(String[] args)
    {
int[] numbers = {10, 5, 20, 8, 15};
int largest_number = Integer.MIN_VALUE;
int second_largest = Integer.MIN_VALUE;
for (int i=0; i<numbers.length ; i++)
{
    int current_value = numbers[i];

if (current_value > largest_number)
{
    second_largest = largest_number;
    largest_number = current_value;
}
else if (current_value > second_largest && current_value != largest_number)
{
    second_largest = current_value;
}
   }
   System.out.println("Largest number is : " + largest_number);  System.out.println("Second number is : " + second_largest);
}
}