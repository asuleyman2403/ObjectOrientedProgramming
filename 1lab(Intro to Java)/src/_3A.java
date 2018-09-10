import java.util.Scanner;

public class _3A {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        for(int i=b;i<=c;i++)
        {
            if(i%2==0) System.out.println(i+" ");
        }

    }
}
