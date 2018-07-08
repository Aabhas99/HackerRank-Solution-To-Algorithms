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
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(n>m)
        {
            System.out.println("No");
            System.exit(0);
        }
        ArrayList<String> a=new ArrayList<>(m);
        for(int x=0;x<m;x++)
        {
            a.add(sc.next());
        }
        for(int x=0;x<n;x++)
        {
            int i=a.size();
            a.remove(sc.next());
            if(i==a.size())
            {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
