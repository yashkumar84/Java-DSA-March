public class StringsDemo {
    public static void main(String[] args) {
        String s = new String("Yash");
        String y = "Yash";
        String h = "Yash";
        System.out.println(y == h);
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1, 3));
        s.toLowerCase();
        System.out.println(s.contains("ah"));

        int a = 10;
        int b = 20;
        int c = 30;

        if (a >= b && a >= c) {
            System.out.println("A is Greatest");
        } else if (b > a && b > c) {
            System.out.println("B is Greatest ");
        } else {
            System.out.println(" C is Greatest");
        }

    }

}
