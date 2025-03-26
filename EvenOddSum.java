public class EvenOddSum {
    public static void findSum(int num) {
        int pos = 1;
        int evenSum = 0;
        int oddSum = 0;
        while (num > 0) {
            int rem = num % 10;
            if (pos % 2 == 0) {
                evenSum += rem;
            } else {
                oddSum += rem;
            }
            num /= 10;
            pos++;
        }

        System.out.println("Even Sum is " + evenSum);
        System.out.println("Odd Sum is " + oddSum);
    }

    public static void main(String[] args) {
        int num = 8765;
        findSum(num);
    }

}
