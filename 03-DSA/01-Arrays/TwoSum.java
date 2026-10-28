import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
         int[] numbers = {2, 7, 11, 15};// arr 0, 1, 2, 3
        int target = 9; //array index 0 and 1 sum is equal to target (ie 2, 7)
        
//HashMap to store key-value pair 
HashMap<Integer, Integer> map = new HashMap<>();

for(int i=0; i<numbers.length; i++)
{
    int neededValue = target - numbers[i];
    if(map.containsKey(neededValue))
    {
        System.out.println(map.get(neededValue) + " " + "," + i);
    }
   map.put(numbers[i], i);
}
}
}