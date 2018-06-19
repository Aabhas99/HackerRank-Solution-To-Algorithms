import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] acmTeam(String[] topic) {
        int ar[]=new int[2];
        int l=0;
        int co=0;
        for(int x=0;x<topic.length;x++)
        {
            for(int y=x+1;y<topic.length;y++)
            {
                int c=0;
                for(int z=0;z<topic[0].length();z++)
                {
                     if(topic[x].charAt(z)=='1'||topic[y].charAt(z)=='1')
                     {
                         c++;
                     }
                }
            
                if(l==c)
                {
                    co++;
                }
                if(c>l)
                {
                    l=c;
                    co=1;
                }
            }
        }
        ar[0]=l;
        ar[1]=co;
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
