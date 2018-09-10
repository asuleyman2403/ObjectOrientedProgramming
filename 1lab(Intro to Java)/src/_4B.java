import java.util.Scanner;
public class _4B {
    public static void main(String[] args) {
        //int a[1111];
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();
        for(int i=0;i<n;i++)
        {
            int t = b.nextInt();
            if(t%2==0)
                System.out.println(t);
        }

    }
}
