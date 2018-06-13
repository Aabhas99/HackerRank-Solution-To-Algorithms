import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
              /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String c;
        String da;
        String g;

        /* Read and save an integer, double, and String to your variables.*/
        a=scan.nextInt();
        b=scan.nextDouble();
        c=scan.next();
        da=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the           Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+a);
        System.out.println(d+b);
         g=s+c;
        g=g+da;
        System.out.println(g);
        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}
