import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,1};
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++)
        {
if(!set.add(nums[i])) //if no already exists
{
    
    System.out.println("Duplicate found: " + nums[i]);
    return;
}
        }
        System.out.println("No duplicates found");
    }
}
