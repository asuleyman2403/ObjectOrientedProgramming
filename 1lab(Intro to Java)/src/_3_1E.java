import java.util.Scanner;

public class _3_1E {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;
        int i=1;
        int n = a.nextInt();
        while(i<n)
        {
            d++;
            i=i*2;
        }


        System.out.println(d);

    }
}
