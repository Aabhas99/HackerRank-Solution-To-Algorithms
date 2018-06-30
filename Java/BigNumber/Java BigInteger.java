import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger c=new BigInteger(n);
        System.out.println(c.isProbablePrime(1) ? "prime" :"not prime");
        scanner.close();
    }
}
