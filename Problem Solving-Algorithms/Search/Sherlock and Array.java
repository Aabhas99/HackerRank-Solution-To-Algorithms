import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        long s1=a[0],s2=0l;
        int k=1;
                for(int x=2;x<a.length;x++)
                {
                    s2+=a[x];
                }
        if(a.length==1)
        {
            return "YES";
        }
            while(k!=a.length-1&&s1<=s2)
            {
                if(s1==s2)
                {
                    return "YES";
                }
                s1+=a[k];
                s2-=a[k+1];
                k++;
            }
        
        return "NO";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
