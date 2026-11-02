import java.util.HashSet;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args)
    {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4};
        //index marks where to place the next unique number.
        int index = 0;
        //Remoe Duplicate
       HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++)
             {
                set.add(numbers[i]);
        }
        System.out.println(set);
    }
    
}
