import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int theLoveLetterMystery(String s){
        int c=0;
        int j=s.length()-1;
        int i=0;
        while(i<j)
        {
            
                char c1=s.charAt(i);
            char c2=s.charAt(j);
            c=c+Math.abs(c1-c2);
            i++;
            j--;
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
