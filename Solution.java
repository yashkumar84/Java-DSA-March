public class Solution {
    public static int foo(int n) {
        if (n <= 1)
            return 1;
        return foo(n - 1) + foo(n - 2);
    }

    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            x += i;
        }
        System.out.println(x);
    }
}
