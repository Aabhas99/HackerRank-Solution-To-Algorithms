import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        for(int arr_i = 0; arr_i < n; arr_i++){
            a.add(in.nextInt());
        }
        int m = in.nextInt();
        for(int brr_i = 0; brr_i < m; brr_i++){
            b.add(in.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        int i=0;
        int x=0;
        while(x!=n&&i!=m)
        {
            int z=(a.get(x)).intValue();
            int c1=0,c2=0;
            while(x!=n&&z==(a.get(x)).intValue())
            {
                x++;
                c1++;
            }
            while(i!=m&&z==(b.get(i)).intValue())
            {
                i++;
                c2++;
            }
            if(c2>c1)
            {
                System.out.print(z+" ");
            }
        }

        in.close();
    }
}
