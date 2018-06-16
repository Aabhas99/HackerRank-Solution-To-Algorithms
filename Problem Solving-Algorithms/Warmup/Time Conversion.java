import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void timeConversion(String s) {
        if(s.substring(s.length()-2).equalsIgnoreCase("am"))
        {
            if(s.substring(0,2).equalsIgnoreCase("12"))
            {
                System.out.println("00"+s.substring(2,s.length()-2));
            }
            else
            {
                System.out.println(s.substring(0,s.length()-2));
            }
        }
        else
        {
            if(s.substring(0,2).equalsIgnoreCase("12"))
            {
                System.out.println(s.substring(0,s.length()-2));
            }
            else
            {
                 int sa=Integer.parseInt(s.substring(0,2));
                 sa=sa+12;
                 System.out.println(sa+":"+s.substring(3,s.length()-2));
            }
        }// Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion(s);
    }
}
