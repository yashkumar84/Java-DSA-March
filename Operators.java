
public class Operators {
    public static void main(String[] args) {
        // // Operators
        // // 1. Arithmetic Operators
        // // + , - , * , / , %
        // // Increment Operator - ++ , --
        int a = 10;
        // System.out.println(a--);
        // //Conditional Operators
        // > , < , >= , <= , == , !=

        // Assignment Operators
        a += 10; // a= a+ 10;
        // += , -= , *= , /= , %= , =

        // Logical Operators

        // && , || , !
        int b = 9;
        if (a > b && a > 10) {

        }

        if (a > b || a > 10) {

        }
        if (!(a > b)) {

        }

        // Bitwise Operators

        // ~ , | , & , ^ , << , >>

        a = 5;
        b = 2;
        System.out.println(a & b);
        System.out.println(~-12);
        System.out.println(~23);

        System.out.println(7 ^ 4);
        System.out.println(5 >> 1);

    }

}
