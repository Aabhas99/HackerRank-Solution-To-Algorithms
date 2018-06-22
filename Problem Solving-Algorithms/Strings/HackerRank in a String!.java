import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String hackerrankInString(String s) {
        String ar="";
        int c=0;
        String h="hackerrank";
        for(int x=0;x<s.length();x++)
        {
            if(h.charAt(c)==s.charAt(x))
            {
                ar=ar+s.charAt(x);
                if(++c>9)
                {
                    break;
                }
            }
        }
        
        if(h.equals(ar))
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
