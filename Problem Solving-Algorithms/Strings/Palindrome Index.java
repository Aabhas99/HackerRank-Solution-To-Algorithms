import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int palindromeIndex(String s){
        for(int x=0;x<=(s.length()-1)/2;x++)
        {   
            if(s.charAt(x)!=s.charAt(s.length()-1-x))
            {
                if(s.charAt(x+1)==s.charAt(s.length()-1-x)&&s.charAt(x+2)==s.charAt(s.length()-2-x))
                {
                    return x;
                }
                if(s.charAt(x)==s.charAt(s.length()-2-x))
                {
                    return s.length()-x-1;
                }
            }
        }
        return -1;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
