import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ar = new LinkedList<>();
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            ar.add(sc.nextInt());
        }
        int b=sc.nextInt();
        for(int x=0;x<b;x++)
        {
            String k=sc.next();
            int r,t;
            if(k.equals("Insert"))
            {
                r=sc.nextInt();
                t=sc.nextInt();
                ar.add(r,t);
            }
            else
            {
                r=sc.nextInt();
                ar.remove(r);
            }
        }
        for (Integer num : ar) {
            System.out.print(num + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
