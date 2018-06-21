import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulTriplets(int d, int[] arr) {
        int c=0;
        for(int x=0;x<=arr.length-3;x++)
        {
            int a=arr[x]+d;
            int y=x+1;
            outer:
            while(y<=arr.length-2&&a>=arr[y])
            {
                 
                if(a==arr[y])
                {
                    a=a+d;
                    int z=y+1;
                   
                    while(z<=arr.length-1&&a>=arr[z])
                    {
                          if(a==arr[z])
                         {
                            c++;
                              break outer;
                         }
                        z++;
                    }
                    break outer;
                    
                }
                y++;
            }
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        in.close();
    }
}
