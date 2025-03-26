public class SwapFirstAndLastDigit {

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count = count + 1;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 1;
        if (num <= 0) {
            System.out.println("Number should be Greater than 0");
            return;
        }
        int count = countDigits(num);
        if (count <= 1) {
            System.out.println("Number should be at least of 2 length");
            return;
        }
        int lastDigit = num % 10;
        int firstDigit = num / (int) Math.pow(10, count - 1);
        num /= 10;
        int remaining = num % (int) Math.pow(10, count - 2);
        int result = lastDigit * (int) Math.pow(10, count - 2) + remaining;
        result = result * 10 + firstDigit;
        System.out.println(result);

    }

}
