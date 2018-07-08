import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        Map<String,Integer> al=new HashMap<>();
        int c=0;
    for(int x=0;x<s.length();x++)
    {
        for(int y=0+x;y<s.length();y++)
        {
            char ar[]=(s.substring(x,y+1)).toCharArray();
            Arrays.sort(ar);
            String q=(String.valueOf(ar));
            Integer o=al.get(q);
            if(o==null)
            {
                al.put(q,1);
            }
            else
            {
                al.put(q,o+1);    
            }
        }
    }
        for(String as:al.keySet())
        {
            int ww=al.get(as);
            c+=ww*(ww-1)/2;
        }
    return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = (scanner.nextLine());

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
