public class Square {
    static void printStar(int n) {
        for (int row = 0; row < n; row++) {
            for (int stars = 0; stars < n; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= n - row + 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // printStar(n);
        printTriangle(n);

    }

}
