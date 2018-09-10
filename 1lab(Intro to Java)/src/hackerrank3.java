import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackerrank3 {





    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if(b%2==1) System.out.println("Weird");
        else if(b%2==0&&(b>=2&&b<=5)) System.out.println("Not Weird");
        else if(b%2==0&&(b>=6&&b<=20)) System.out.println("Weird");
        else if(b%2==0&&b>20) System.out.println("Not Weird");
    }
}
