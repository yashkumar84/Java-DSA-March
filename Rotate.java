public class Rotate {

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count = count + 1;
            n /= 10;
        }

        return count;
    }

    static void rotateClockWise(int n, int k) {
        int count = countDigits(n);
        k = k % count;
        int right = n % (int) Math.pow(10, k);
        int left = n / (int) Math.pow(10, k);
        int result = right * (int) Math.pow(10, count - k);
        result += left;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int num = 12345; // 51234 - > 45123
        int k = 7;
        rotateClockWise(num, k);
    }

}
