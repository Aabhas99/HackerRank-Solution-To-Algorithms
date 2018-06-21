import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int howManyGames(int p, int d, int m, int s) {
        int sum=0;
        int c=0;
        while(sum<s)
        {
            c++;
            sum=sum+p;
            if(sum>s)
            {
               
                return c-1;
            }
            if(p!=m)
            {
                p=p-d;
            }
            if(p<=m)
            {
                p=m;
            }
        }
        return c;
        // Return the number of games you can buy
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}
