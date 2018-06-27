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
        List<String> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            a.add(sc.next());
        }
        int m=sc.nextInt();
        Collections.sort(a);
        for(int x=0;x<m;x++)
        {
            String s=sc.next();
            int c=0;
            if(a.contains(s))
            {
                c++;
                int i=a.indexOf(s);
                while(i+1!=n&&s.equals(a.get(i+1)))
                {
                    c++;
                    i++;
                }
            }
            System.out.println(c);
        }
    }
}
