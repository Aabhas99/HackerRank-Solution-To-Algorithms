import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        int c=0;
           for(int x=97;x<=122;x++)
        {
            int q=0,w=0;
            for(int y=0;y<s1.length();y++)
            {
                if(s1.charAt(y)==x)
                {
                    q++;
                }
            }
            for(int y=0;y<s2.length();y++)
            {
                if(s2.charAt(y)==x)
                {
                    w++;
                }
            }
            if(q>0&&w>0)
            {
                c=c+Math.min(q,w);
            }
        }
        return s1.length()+s2.length()-2*c;
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
