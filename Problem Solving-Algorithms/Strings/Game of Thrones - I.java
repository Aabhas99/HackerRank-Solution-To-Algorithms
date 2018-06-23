import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        int f=0;
        for(int x=0;x<ch.length;x++)
        {
            int co=0;
            int c=ch[x];
            while(x!=s.length()&&c==ch[x])
            {
                co++;
                x++;
            }
            x--;
            if(co%2!=0)
            {
                if(ch.length%2==0)
                {
                    return "NO";
                }
                f++;
            }
            if(f==2)
            {
                return "NO";
            }
        }
        return "YES";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
