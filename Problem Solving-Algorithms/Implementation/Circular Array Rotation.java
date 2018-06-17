import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int[] m,int k) {
        int ar[]=new int[a.length];
        for(int x=0;x<a.length;x++)
        {
            int c=(x+k)%a.length;
            ar[c]=a[x];
        }
        int arr[]=new int[m.length];
        
        
        for(int x=0;x<m.length;x++)
        {
            arr[x]=ar[m[x]];
        }
        
        return arr;
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, m,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
