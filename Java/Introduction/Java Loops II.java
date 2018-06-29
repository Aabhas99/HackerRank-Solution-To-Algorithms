import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=a;
            for(int x=0;x<n;x++)
            {
                c=c+(int)Math.pow(2,x)*b;
                System.out.print(c+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
