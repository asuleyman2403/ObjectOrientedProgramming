import java.util.Scanner;

public class _2E {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        if(b>c) System.out.println(1);
        else if(b<c) System.out.println(2);
        else System.out.println(0);

    }
}
