import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList[] arrli = new ArrayList[n];
        for(int x=0;x<n;x++)
        {
            int a=sc.nextInt();
            arrli[x]=new ArrayList();
            for(int y=0;y<a;y++)
            {
                arrli[x].add(sc.nextInt());
            }
        }
        int q=sc.nextInt();
        for(int x=0;x<q;x++)
        {
            int r=sc.nextInt();
            int t=sc.nextInt();
            try{
            System.out.println(arrli[r-1].get(t-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
