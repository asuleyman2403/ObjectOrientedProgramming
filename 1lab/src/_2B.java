import java.util.Scanner;

public class _2B {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if(b%4==0&&b%100!=0)
        {
            System.out.println("YES");
        }
        else if(b%400==0)
            System.out.println("YES");
        else System.out.println("NO");

    }
}
