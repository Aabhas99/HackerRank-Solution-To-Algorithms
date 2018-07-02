import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        if(a%2==0)
        {
            c=a-1;
        }
        long s=(c-1)*5l;
        
        for(int x=1;x<=5;x++)
        {
            if(x==b)
            {
                if(a%2==0)
                {
                 System.out.println(s+1);
                }
                else
                {
                    System.out.println(s);
                }
                break;
            }
            
            s+=2;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
