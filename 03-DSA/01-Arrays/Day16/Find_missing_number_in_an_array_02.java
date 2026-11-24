public class Find_missing_number_in_an_array_02 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 6}; // 1 to 6

        int total_sum = 0;

        for (int i=0; i<numbers.length; i++)
        {
total_sum = total_sum + numbers[i]; //17
//System.out.println("Total Sum is : " + total_sum);
        }
int n=6;
int expected = n * (n + 1) / 2; //15
int missed = expected - total_sum ; 
        
       System.out.println("Total Sum is : " + total_sum);
       System.out.println("Expected is : " + expected);
       System.out.println("Expected is : " + missed);
    }
        }