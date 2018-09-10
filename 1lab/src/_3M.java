import java.util.Scanner;

public class _3M {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;
        int b = a.nextInt();
        for(int i=1;i<=b;i++)
        {
            int c = a.nextInt();
            if(c==0) d++;
        }

        System.out.println(d);

    }
}
