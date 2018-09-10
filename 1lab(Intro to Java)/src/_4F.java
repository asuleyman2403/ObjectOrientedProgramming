import java.util.Scanner;
public class _4F {
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
        for(int i=1;i<n-1;i++)
        {
            if(a[i]>a[i-1])
                q++;
            if(a[i]>a[i+1])
                q++;
            if(q==2) ans++;
            q=0;
        }
        System.out.print(ans);
    }
}
