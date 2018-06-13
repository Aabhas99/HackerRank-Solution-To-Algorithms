import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s="";
        while(a!=0)
        {
            s=a%2+s;
            a=a/2;
        }
        s=s+"0";
        int c=0,d=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='1')
            {
                c++;
            }    
            else
            {
                if(d<c)
                {
                    d=c;
                }
                c=0;
            }
        }
        System.out.println(d);
    }
}
