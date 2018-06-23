import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        int l=s.length();
        int n=0;
        char ch=s.charAt(0);
        if(ch=='A'||ch=='B')
        {
            n++;
        }
        for(int x=1;x<l;x++)
        {
            if(s.charAt(x)!=ch)
            {
                ch=s.charAt(x);
                n++;
            }
        }
        return l-n;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
