import java.util.Scanner;

public class _3I {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 1;
        int b = a.nextInt();
        for(int i=1;i<=b/2;i++)
        {
            if(b%i==0) d++;
        }
        System.out.println(d);

    }
}
