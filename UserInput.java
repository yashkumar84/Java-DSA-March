import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter A Number : ");
        // int n = sc.nextInt();
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println(name);
        float f = sc.nextFloat();

        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);

    }

}
