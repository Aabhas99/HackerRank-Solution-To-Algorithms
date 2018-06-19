import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String appendAndDelete(String s, String t, int k) {
        if(s.equals(t))
        {
            
                return "Yes";
            
        }
        int x=1;
        while(x<s.length()&&x<t.length()&&(s.substring(0,x).equals(t.substring(0,x))))
        {
            x++;
        }
        
            if(k==(s.length()-2*(x-1)+t.length()))
            {
                return "Yes";
            }
        if(x==1)
        {
            if(k>=s.length()+t.length())
            {
                return "Yes";
            }
        }
        return "No";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }
}
