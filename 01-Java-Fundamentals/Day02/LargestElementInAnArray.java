public class LargestElementInAnArray {
    public static void main(String[] args)
    {
        int[] arr = {2,4,6,8,9};
        int largest=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
    }
    
}
