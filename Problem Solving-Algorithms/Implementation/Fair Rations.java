import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int fairRations(int[] B) {
        int c=0;
        for(int x=0;x<B.length;x++)
        {
            if(x==B.length-1&&B[x]%2!=0)
            {
                System.out.println("NO");
                System.exit(0);
            }
            if(B[x]%2!=0)
            {
                c=c+2;
                B[x]++;
                B[x+1]++;
            }
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N];
        for(int B_i = 0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int result = fairRations(B);
        System.out.println(result);
        in.close();
    }
}
