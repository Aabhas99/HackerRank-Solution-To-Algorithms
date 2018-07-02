import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int xa=0;xa<t;xa++)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> a=new ArrayList<>(n);
            int i=n-1;
            int j=0;
            for(int x=0;x<n/2;x++)
            {
                a.add(i--);
                a.add(j++);
            }
            if(n%2!=0)
            {
                a.add(j);
            }
            System.out.println(a.indexOf(k));
        }
    }
}
