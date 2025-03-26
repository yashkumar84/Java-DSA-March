public class Power {
    static int pow(int num, int pow) {
        int ans = 1;
        for (int i = 0; i < pow; i++) {
            ans *= num;
        }

        return ans;
    }

    public static void main(String[] args) {
        int num = 3;
        int pow = 3;
        System.out.println(pow(num, pow));
    }

}
