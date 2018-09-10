import java.util.Scanner;
public class _5C {
    public int xr(int x, int y)
    {
        if(x!=y) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        _5C c = new _5C();
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        //String s= String(xr(b,a));
        //String s = Boolean.toString(c.xr(b,a));
        System.out.println(c.xr(b,a));
    }
}

