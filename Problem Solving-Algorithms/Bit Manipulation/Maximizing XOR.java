import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximizingXor(int l, int r) {
        int la=0;
        for(int x=l;x<r;x++)
        {
            for(int y=x+1;y<=r;y++)
            {
                int k=x^y;
                if(k>la)
                {
                    la=k;
                }
            }
        }
        return la;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}
