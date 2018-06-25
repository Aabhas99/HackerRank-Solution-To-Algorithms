import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] maximumPerimeterTriangle(int[] l) {
        Arrays.sort(l);
        int ar[]=new int[3];
        for(int x=l.length-1;x>=2;x--)
        {
            if(l[x-2]+l[x-1]>l[x])
            {
                ar[0]=l[x-2];
                ar[1]=l[x-1];
                ar[2]=l[x];
                return ar;
            }
        }
        System.out.println("-1");
        System.exit(0);
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] l = new int[n];
        for(int l_i = 0; l_i < n; l_i++){
            l[l_i] = in.nextInt();
        }
        int[] result = maximumPerimeterTriangle(l);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
