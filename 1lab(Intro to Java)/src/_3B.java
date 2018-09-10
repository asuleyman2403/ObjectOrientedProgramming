import java.util.Scanner;

public class _3B {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        int e = a.nextInt();
        for (int i = b; i <= c; i++) {
            if (i % e == d) System.out.println(i + " ");
            else continue;
        }
    }
}