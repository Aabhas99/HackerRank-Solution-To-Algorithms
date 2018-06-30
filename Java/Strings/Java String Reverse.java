import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int c=0;
        for(int x=0;x<=(A.length()-1)/2;x++)
        {
            if(!(A.charAt(x)==A.charAt(A.length()-1-x)))
               {
                   c++;
                   break;
               }
        }
               if(c==0)
               {
                   System.out.println("Yes");
               }
               else
               {
                   System.out.println("No");
               }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
