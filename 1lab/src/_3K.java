import java.util.Scanner;

public class _3K {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;
        int b = a.nextInt();
        for(int i=1;i<=b;i++)
        {
            int c = a.nextInt();
            d+=c;
        }

        System.out.println(d);

    }
}
