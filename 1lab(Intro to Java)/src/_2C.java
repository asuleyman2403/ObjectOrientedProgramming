import java.util.Scanner;

public class _2C {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        if((c!=1&&b!=1)||(c==1&&b==1)) System.out.println("YES");
        else System.out.println("NO");

    }
}
