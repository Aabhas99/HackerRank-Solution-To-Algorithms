import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twoCharaters(String s) {
        int c=-1;
        int l=0;
        char ar[]=new char[s.length()];
            for(int y=97;y<=122;y++)
            {
                int k=0;
                for(int x=0;x<s.length();x++)
                {
                
                     if((char)y==s.charAt(x))
                    {
                        k++;
                    }
                }
                if(k>0)
                {
                    
                    ar[++c]=(char)y;
                }
            
            }
        if(c<1)
        {
            return 0;
        }
        for(int x=0;x<=c-1;x++)
        {
            for(int y=1+x;y<=c;y++)
            {
                char ch1=ar[x];
                char ch2=ar[y];
                String t="";
                for(int z=0;z<s.length();z++)
                {
                    char ch3=s.charAt(z);
                    {
                        if(ch3==ch1||ch3==ch2)
                        {
                            t=t+ch3;
                        }
                    }
                }
                int a=0;
                for(int z=0;z<t.length()-1;z++)
                {
                    if(t.charAt(z)==t.charAt(z+1))
                    {
                       a++; 
                    }
                }
                if(a==0)
                {
                    if(t.length()>l)
                    {
                        l=t.length();
                    }
                }
            }
        }
        return l;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
