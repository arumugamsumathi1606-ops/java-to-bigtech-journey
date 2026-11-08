import java.util.HashMap;
public class TwoSumHM {
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 4};
int target = 6;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0 ; i<nums.length; i++)
        {
            int neededValue = target - nums[i];
            if(map.containsKey(neededValue))
            {
               System.out.println(map.get (neededValue) + ", " + i);

            }
            map.put(nums[i], i);

        }
        
    }
}