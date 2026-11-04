public class Two_Sum_NegativeValues { 
    public static void main(String[] args)
    {
        // i = 0 -> 3 ; j=-2 ; 0-2 = -2 skip as no 6
        // i= 3 and j = 3 = > 6 
      int[]  nums = {3, -2, 4, 3};
int target = 6;

//loop through the array to find the two numbers that add up to the target
for (int i=0; i< nums.length ;i++)
{
    for (int j = i+1 ; j<nums.length ; j++)
    { 
        int sum = nums[i] + nums[j];
        if(sum == target)
        {
          //  System.out.println(nums[i] + " " + nums[j]);
          System.out.println(i + " " + j);
        }
    }
    
}

    }
}