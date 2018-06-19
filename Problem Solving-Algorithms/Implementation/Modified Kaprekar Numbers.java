import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] kaprekarNumbers(String p, String q) {
        int ar[]=new int[Integer.parseInt(q)-Integer.parseInt(p)+1];
        int i=-1;
        int x=Integer.parseInt(p);
        if(Integer.parseInt(p)==1)
        {
            ar[++i]=1;
            x=9;
        }
        for(;x<=Integer.parseInt(q);x++)
        {
            if(x%100==0||x==10)
            {
                continue;
            }
            
            String s=(1l*x*x)+"";
            
            String a=s.substring(0,String.valueOf(x).length());
            String b=s.substring(String.valueOf(x).length());
            String c=s.substring(0,String.valueOf(x).length()-1);
            String d=s.substring(String.valueOf(x).length()-1);
                        

            if(Integer.parseInt(a)+Integer.parseInt(b)==x||((Integer.parseInt(c)+Integer.parseInt(d)==x)&&s.length()%2!=0))
            {
             
                ar[++i]=x;
            }
           
        }
        if(i==-1)
        {
            System.out.println("INVALID RANGE");
            System.exit(0);
        }
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = in.next();
        String q = in.next();
        int  result[] = kaprekarNumbers(p, q);
        for (int i = 0; i < result.length; i++) {
            if(result[i]==0)
            {
                System.exit(0);
            }
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
