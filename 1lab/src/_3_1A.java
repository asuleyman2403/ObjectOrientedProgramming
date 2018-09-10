import java.util.Scanner;

public class _3_1A {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;
        int i=1;
        int n = a.nextInt();
        while(i<=n)
        {
            if(i*i<=n) System.out.println((i*i)+" ");

            i++;
        }


        // System.out.println(d);

    }
}
