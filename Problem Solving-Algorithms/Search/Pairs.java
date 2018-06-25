import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<>();
        int k=sc.nextInt();
        int c=0;
        for(int x=0;x<n;x++)
        {
            int q=sc.nextInt();
            a.add(q);
        }
        Collections.sort(a);
        for(int x=0;x<n;x++)
        {
            if(Collections.binarySearch(a,(a.get(x)+k))>=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
