import java.util.Scanner;
public class _4G {
    public static void main(String[] args) {
        int[] a;
        a = new int[1000];
        int q=0,ans=0;
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = b.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        //System.out.print(ans);
    }
}
