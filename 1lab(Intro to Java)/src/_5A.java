import java.util.Scanner;


import static java.lang.Math.sqrt;

public class _5A {

    public static void main(String[] args) {
        // write your code here

        int q,w,e,r;
        String s,s2;
        Scanner a = new Scanner(System.in);
        q = a.nextInt();
        w = a.nextInt();
        e = a.nextInt();
        r = a.nextInt();
        System.out.print(Math.min(Math.min(q,w),Math.min(e,r)));
    }
}
