import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();

        System.out.println("Enter Name");
        Scanner scn = new Scanner(System.in);
      //  String s = new String();
        String name = scn.nextLine();

        System.out.println("Enter YEAR OF STUDY");

        int year = sc.nextInt();
        Student std = new Student(name,id,year);
        std.show();
    }
}
