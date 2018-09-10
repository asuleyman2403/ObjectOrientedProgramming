import java.util.Scanner;

public class _1E {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int s = Math.abs(b*c);
        if(s%109==0) System.out.println(0);
        else if (b<0) System.out.println(109-(s%109));
        else System.out.println(s%109);

    }
}
