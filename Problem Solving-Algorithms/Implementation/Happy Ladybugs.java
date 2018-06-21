import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            char ar[]=b.toCharArray();
            char ar2[]=b.toCharArray();
            Arrays.sort(ar);
            int i=n-1,c=0,d=0;
            while(i!=-1&&ar[i]=='_')
            {
                c++;
                i--;
            }
            if(c==ar.length)
            {
                System.out.println("YES");
                        continue;
            }
            if(c==0)
            {
                if(ar.length-c==1)
                {
                   System.out.println("NO");
                 continue; 
                }
                int f=0;
                for(int x=0;x<=n-1-c;x++)
                {
                    char q=ar2[x];
                    
                    int co=1;
                    while(x+1!=ar.length&&ar2[x+1]==q)
                    {
                        co++;
                        x++;
                    }
                    if(co==1)
                    {
                        System.out.println("NO");
                        f++;
                        break;
                    }
                }
                if(f==0)
                {
                    
                     System.out.println("YES");
                }
                
            }
            else
            {
                if(ar.length-c==1)
                {
                   System.out.println("NO");
                 continue; 
                }
                int f=0;
                
                for(int x=0;x<=n-1-c;x++)
                {
                    char q=ar[x];
                    
                    int co=1;
                    while(ar[x+1]==q)
                    {
                        co++;
                        x++;
                    }
                    if(co==1)
                    {
                        System.out.println("NO");
                        f++;
                        break;
                    }
                }
                if(f==0)
                {
                    System.out.println("YES");
                }
            }
        }
    }
}
