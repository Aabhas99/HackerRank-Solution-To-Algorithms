import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
        if(s.length()%2!=0)
        {
            return -1;
        }
        String a=s.substring(0,s.length()/2),b=s.substring(s.length()/2);
     
        int co=0;
        for(int x=97;x<=122;x++)
        {
            int q=0,w=0;
            for(int y=0;y<a.length();y++)
            {
                if(a.charAt(y)==x)
                {
                    q++;
                }
                if(b.charAt(y)==x)
                {
                    w++;
                }
            }
            co=co+Math.min(q,w);
        }
        return a.length()-co;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            long result = anagram(s);
            System.out.println(result);
        }
    }
}
