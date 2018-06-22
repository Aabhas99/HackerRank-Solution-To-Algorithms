import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        String t="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if((ch>=97&&ch<=122))
            {
                ch=(char)(ch+k);
                while(ch>122)
                {
                    ch=(char)(ch-122+96);
                }
            }
            else if((ch>=65&&ch<=90))
            {
                ch=(char)(ch+k);
                while(ch>90)
                {
                    ch=(char)(ch-90+64);
                }
            }
            t=t+ch;
        }
        return t;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
