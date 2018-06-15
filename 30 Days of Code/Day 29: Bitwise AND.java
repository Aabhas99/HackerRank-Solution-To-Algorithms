import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();            int c=0;
            for(int y=1;y<=a-1;y++)
            {
                for(int z=2;z<=a;z++)
                {
                    if(y<z)
                    {
                        int q=y&z;
                        if((q>c)&&(q<b))
                        {
                            c=q;
                        }
                    }
                }
                
            }
            System.out.println(c);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
