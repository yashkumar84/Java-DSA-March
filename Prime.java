public class Prime {


    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                // System.out.println("The Number is not Prime");
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            System.out.println("The Number is Prime");
        } else {
            System.out.println("The Number is Not Prime ");
        }
    }

}
