public class Factorial {
    static int getFactorial(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.println(getFactorial(num));
    }

}
