public class TwoSumInASortedArray
{
    public static void main(String[] args)
    {
int[] numbers = {1, 2, 4, 6, 8, 9};
int target = 10;

int left = 0;
int right = numbers.length - 1;

for (int i = 0; i< numbers.length ; i++)

    {
if(left < right)
{
    int sum = numbers[left] + numbers[right];
    System.out.println("Sum of " + numbers[left] + " and " + numbers[right] + " is: " + sum);
    if(sum ==  target)
    {
        System.out.println("The two numbers that add up to " + target + " are: " + numbers[left] + " and " + numbers[right]);
   break;
    }
if(sum > target)
{
    right--;
    //break;
}
//validating other conditions as well
else if(sum < target)
{
    left++;
    //break;
}
// else
// {
//     right--;
// }

}
}
    }

}
