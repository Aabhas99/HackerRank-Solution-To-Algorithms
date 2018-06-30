import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzz";
        String largest = "AAA";
        for(int x=0;x<=s.length()-k;x++)
        {
            String q=s.substring(x,x+k);
            if(q.compareTo(smallest)<0)
            {
                smallest=q;
            }
            if(q.compareTo(largest)>0)
            {
                largest=q;
            }
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
