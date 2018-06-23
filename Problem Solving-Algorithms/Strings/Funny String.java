import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        StringBuilder a=new StringBuilder(s);
        a.reverse();
        String q=a.toString();
        for(int x=1;x<s.length();x++)
        {
            char ch1=s.charAt(x-1);
            char ch2=s.charAt(x);
            char ch3=q.charAt(x-1);
            char ch4=q.charAt(x);
            int i=(int)(ch2-ch1);
            int j=(int)(ch4-ch3);
            if(Math.abs(i)!=Math.abs(j))
            {
                return "Not Funny";
            }
            
        }
        return "Funny";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
