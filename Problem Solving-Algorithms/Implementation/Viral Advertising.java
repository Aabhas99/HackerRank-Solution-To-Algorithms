import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int viralAdvertising(int n) {
        if(n==1)
        {
            return 2;
        }
        int s=2;
        int y=2;
        for(int x=2;x<=n;x++)
        {
            y=y*3/2;
            s=s+y;
        }
        return s;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
