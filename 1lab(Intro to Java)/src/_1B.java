import java.util.Scanner;


import static java.lang.Math.sqrt;

public class _1B {

    public static void main(String[] args) {
        // write your code here

        double d;
        String s,s2;
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
        System.out.println("The next number for the number " + i + " is " + (i + 1) + ".");
        System.out.println("The previous number for the number " + i + " is " + (i - 1) + ".");
    }
}
