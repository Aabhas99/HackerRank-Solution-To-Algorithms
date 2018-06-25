import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m =sc.nextInt();
            int n = sc.nextInt();
            List<Integer> w=new ArrayList<>();
            List<Integer> wa=new ArrayList<>();
            for(int arr_i = 0; arr_i < n; arr_i++){
                Integer f=sc.nextInt();
                w.add(f);
                wa.add(f);
            }
        Integer a[]=new Integer[2];
        Collections.sort(w);
            int x=0;
        while(true)
        {
            int v=(w.get(x)).intValue();
            int k=wa.indexOf(w.get(x));
            w.set(x,-1);
            
            int b=w.indexOf(new Integer(m-v));
            if(b!=-1)
            {
                int qa=(wa.indexOf(v)+1);
                
            wa.set(k,-1);
               
                int qb=wa.indexOf(new Integer(m-v))+1;
                if(qa<qb)
                {
                    System.out.print(qa+" ");
                    System.out.println(qb);
                }
                else
                {
                    System.out.print(qb+" ");
                    System.out.println(qa);
                }
                break;
            }
            x++;
        }
        }
        sc.close();
    }
}
