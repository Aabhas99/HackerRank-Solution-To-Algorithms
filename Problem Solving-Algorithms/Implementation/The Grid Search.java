import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gridSearch(String[] G, String[] P) {
        int k=0;
        int xa=0;
        ou:
        for(int x=0;x<G.length;x++)
        {
            if(G[x].contains(P[0]))
            {
                k=x;
                xa=G[x].indexOf(P[0]);
                int l=P[0].length();
                int y=1;                
                while(y<P.length)
                {
                    String s=G[x+1].substring(xa,xa+l);
                    if(!(s.equals(P[y])))
                    {
                        x=k-1;
                        G[k]=G[k].substring(0,xa)+"#"+G[k].substring(xa+1);
                        continue ou;
                    }
                    y++;
                    x++;
                }
                return "YES";
            }
        }
        return "NO";
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i = 0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i = 0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            String result = gridSearch(G, P);
            System.out.println(result);
        }
        in.close();
    }
}
