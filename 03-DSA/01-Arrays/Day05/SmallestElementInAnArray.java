public class SmallestElementInAnArray {
    public static void main(String[] args)
    {
        int arr[] = {12, 5, 8, -3, 20};
        int smallest = Integer.MAX_VALUE;

        for ( int i=0 ; i < arr.length ; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);

    }
    
}
