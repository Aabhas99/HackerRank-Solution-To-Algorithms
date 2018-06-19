import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();
        int f=0;
        if(y1==y2&&m1==m2&&d1>d2)
        {
                f=(d1-d2)*15;
        }
        else if(y1==y2&&m1>m2)
        {
            f=500*(m1-m2);
        }
        else if(y1>y2)
        {
            f=10000;
        }
        System.out.println(f);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
