import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
        String ar[]=new String[t];
        for(int x=0;x<t;x++)
        {       
            ar[x]=sc.next();
        }
        sc.close();
        for(int x=0;x<t;x++)
        {
            String a="",b="";
            for(int y=0;y<ar[x].length();y++)
            {
                if(y%2==0)
                {
                    a=a+ar[x].charAt(y);
                }
                else
                {
                    b=b+ar[x].charAt(y);
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
