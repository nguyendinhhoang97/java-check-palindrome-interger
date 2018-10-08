import java.util.Scanner;

public class CheckPalindromeInteger {
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number){
        boolean check=false;
        if (number==reverse(number))
            check=true;
        return check;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        n = scanner.nextInt();
        System.out.println("Reverse of number is: " + reverse(n));
        if (isPalindrome(n))
            System.out.println("Number entered is palindrome!");
        else
            System.out.println("Number entered is not palindrome!");
    }
}
