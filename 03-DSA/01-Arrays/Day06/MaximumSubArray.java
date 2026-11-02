public class MaximumSubArray {
    public static void main(String[] args)
    {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//         In Kadane's Algorithm, we use two variables:
//  currentSum = the best sum of a subarray ending at the current position.
//  maxSum = the largest subarray sum found anywhere so far.

        int currentSum = numbers[0];
        int maxSum = numbers[0];

        for (int i=1 ; i<numbers.length ; i++)
        {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]); //1, 0 + 1 = 1
            maxSum = Math.max(maxSum, currentSum); //1, 1

        }
System.out.println("Maximum subarray sum is: " + maxSum); // 4, -1, 2, 1
    }
    
}
