import java.util.Scanner;
public class _4E {
    public static void main(String[] args) {
        int[] a;
        a = new int[1000];
        int q=0;
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = b.nextInt();


        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]>0&&a[i]>0)
                q++;
            else if(a[i+1]<0&&a[i]<0)
                q++;

        }
        if(q>0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
