import java.util.Scanner;

public class _3G {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int d=0;
        for(int i=2;i<=b;i++)
        {
            if(b%i==0)
            {
                System.out.println(i);
                d++;
            }
            if(d==1) break;
        }

    }
}
