import java.util.Scanner;

public class _3J {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;

        for(int i=1;i<=100;i++)
        {
            int c = a.nextInt();
            d+=c;
        }

        System.out.println(d);

    }
}
