import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StarTriangle small = new StarTriangle(n);
        System.out.println(small.toString());
    }
}
