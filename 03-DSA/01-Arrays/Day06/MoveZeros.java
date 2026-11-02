import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args)
    {
        int[] numbers = {0, 1, 0, 3, 12};
        int index = 0;

        for (int i=0 ; i<numbers.length ; i++)
        {
if (numbers[i] != 0 )
{
    numbers[index] = numbers[i];
    index++;
}
        }
        //Fill the remaining elements with 0
        for (int i = index; i< numbers.length ; i++)
        {
            numbers[i]=0;
            index++;

        }
    System.out.println(Arrays.toString(numbers));
    }

    
}
