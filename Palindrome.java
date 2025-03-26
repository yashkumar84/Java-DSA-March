public class Palindrome {
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int num = 145;
        int reverse = reverse(num);
        if (num == reverse) {
            System.out.println("The Number is Palindrome ");
        } else {
            System.out.println("The Number is Not  Palindrome");
        }
    }

}
