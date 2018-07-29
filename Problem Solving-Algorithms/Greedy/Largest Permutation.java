import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void largestPermutation(int q,int ar[],int in[],int w) {
        int n=w;
        if(q>=w-1)
        {
            for(int x=n;x>=1;x--)
            {
                System.out.print(x+" ");
            }
            System.exit(0);
        }
        int k=0;
        while(q>0&&w!=0)
        {
            int i=in[w];
            if(i==k)
            {
                k++;
                w--;
                continue;
            }
            int no=ar[k];
            ar[k]=w;
            ar[i]=no;
            in[w]=k;
            in[no]=i;
            q--;
            k++;
            w--;
        }
 
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]+" ");
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[]=new int[n];
        int in[]=new int[n+1];
        for(int arr_i = 0; arr_i < n; arr_i++){
            ar[arr_i]=sc.nextInt();
            in[ar[arr_i]]=arr_i;
        }
        largestPermutation(k,ar,in,n);

        sc.close();
    }
}
