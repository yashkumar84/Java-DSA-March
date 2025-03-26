public class NestedLoops {
    public static void main(String[] args) {
        int num = 3;
        outerLoop: for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 1)
                    continue outerLoop;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
