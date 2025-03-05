public class Conditionals {
    public static void main(String[] args) {
        int a = 2;
        if (a > 10) {
            System.out.println("A is Greater than 10");
        } else {
            System.out.println("A is Not Greater than 10");
        }

        String b = "Hel";
        switch (b) {
            case "Hel":
                System.out.println("Hello YOu have Choosen 1");
                break;

            case "Gel":
                System.out.println("Hello You have Choosen 2");
                break;

            default:
                break;
        }
        String choice = "tea";

        double price = switch (choice) {
            case "tea" -> 50.0;
            case "coffee" -> 100.0;
            case "drink" -> 70.0;
            case "water" -> {
                int ch = 2;
                yield 20 + ch;
            }
            default -> 0.0;

        };

        System.out.println(price);

    }
}