import java.util.Scanner;public class AddNosEnterByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt(); //reads the Integer entered by user
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);

    }
}
