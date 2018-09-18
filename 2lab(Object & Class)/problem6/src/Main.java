import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inWords iw = new inWords(n);
        System.out.println(iw.inWords(n));
    }
}
