public class FindTheSmallestArray {
     public static void main(String[] args)
     {
    // {
    //     int[] arr = {2,4,6,8,9};
    //     int smallest=arr[0];

    //     for(int i=1; i<arr.length; i++)
    //     {
    //         if(arr[i] < smallest)
    //         {
    //             smallest = arr[i];
    //         }
    //     }
    //     System.out.println("Smallest element in the array is: " + smallest);
    // }

    int[] arr = {-8, -3, -15, -1, 8, 9};
    int smallest = arr[0];
    for(int i=1; i<arr.length; i++)
    {
        if(arr[i] < smallest)
        {
            smallest = arr[i];
        }
    }
    System.out.println("Smallest element in the array is: " + smallest);

}
}


    

