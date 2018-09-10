import java.util.Scanner;

public class _3_1D {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int d= 0;
        int i=1;
        int n = a.nextInt();
        while(d==0)
        {
            if(i==n) {System.out.println("YES");break;}
            else if(i>n) {System.out.println("NO"); break;}

            i=i*2;
        }


        // System.out.println(d);

    }
}
