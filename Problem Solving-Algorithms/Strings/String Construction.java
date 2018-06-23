import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s) {
        int c=0;
        for(int x=97;x<123;x++)
        {
            String ch=(char)x+"";
            if(s.contains(ch))
            {
                c++;
            }
        }
        return c;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
