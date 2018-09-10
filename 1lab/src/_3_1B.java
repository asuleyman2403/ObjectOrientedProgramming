import java.util.Scanner;

public class _3_1B {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;
        int i=2;
        int n = a.nextInt();
        while(i<=n)
        {
            if(n%i==0)
            {System.out.println(i);
                break;}
            i++;
        }


        // System.out.println(d);

    }
}
