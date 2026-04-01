
import java.util.Scanner;

public class Task_9{

    // function to check palindrome
    static int isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse)
            return 2;   // palindrome
        else
            return 1;   // not palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = isPalindrome(n);
        System.out.println(result);
    }
}
