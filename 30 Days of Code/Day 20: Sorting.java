import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int b=0;
        for(int x=0;x<n-1;x++)
        {
            for(int y=0;y<=n-2-x;y++)
            {
                if(a[y]>a[y+1])
                {
                    b++;
                    int t=a[y];
                    a[y]=a[y+1];
                    a[y+1]=t;
                }
            }
        }
        System.out.println("Array is sorted in "+b+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        // Write Your Code Here
    }
}
