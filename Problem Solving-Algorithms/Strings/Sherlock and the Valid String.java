import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
    char ch[]=s.toCharArray();
        Integer ar[]=new Integer[26];
        for(int x=0;x<26;x++)
        {
            ar[x]=0;
        }
        for(int x=0;x<s.length();x++)
        {
            ar[ch[x]-97]++;
        }
        Arrays.sort(ar,Collections.reverseOrder());
        for(int x=0;x<26;x++)
        {
            System.out.println(ar[x]);
        }
        int zz=ar[0];
        if(ar[1]==0)
        {
            return "YES";
        }
        if(ar[2]==0)
        {
            if(ar[0]-ar[1]==1)
            {
                return "YES";
            }
            return "NO";
        }
        int i=1;
        int q=ar[0];
        int co1=1,co2=0;
        while(i!=26&&ar[i]!=0)
        {
            if(ar[i]==q)
            {
                co1++;
            }
            else if(q-ar[i]>1)
            {
                if(co2>0)
                {
                    return "NO";
                }
                if(ar[i]==1)
                {
                    if(i==25)
                    {
                        return "YES";
                    }
                    if(ar[i+1]==0)
                    {
                        return "YES";
                    }
                }
                return "NO";
            }
            else
            {
                co2++;
            }
            i++;
        }
        if(co1==1||co2==0||co2==1)
        {
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
