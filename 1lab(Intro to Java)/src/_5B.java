import java.util.Scanner;
public class _5B {
    double pw(double q,double w) {
        double e = 1;
        for (double i = 1; i <= w; i++) {
            e = e * q;
        }
        return e;
    }
    public static void main(String[] args) {
        _5B c = new _5B();
        Scanner sc = new Scanner(System.in);
        double q = sc.nextInt();
        double w = sc.nextInt();
        double e=1;
        for( int i=1;i<=w;i++)
        {
            e=e*q;
        }

        System.out.print(e);
    }
}
