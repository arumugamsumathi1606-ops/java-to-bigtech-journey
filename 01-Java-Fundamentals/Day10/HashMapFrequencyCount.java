import java.util.HashMap;
public class HashMapFrequencyCount {
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
   int[] nums = {2, 3, 2, 4, 3, 2};
   for (int i=0 ; i<nums.length ; i++)
   {
if(map.containsKey(nums[i]))
{
    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
}
else
{
    map.put(nums[i], 1);
}
   } 
   System.out.println(map);
    }
   
}
