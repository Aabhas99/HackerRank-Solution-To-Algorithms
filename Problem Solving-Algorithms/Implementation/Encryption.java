import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        String a="";
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)!=' ')
            {
                a=a+s.charAt(x);
            }
        }
        int z=1;
        while(a.length()>z*z)
        {
            z++;
        }
        int la=a.length();
        for(int w=0;w<z*z-la;w++)
        {
            a=a+"0";
        }
        int x=(int)Math.floor(Math.sqrt(a.length()));
        int y=(int)Math.ceil(Math.sqrt(a.length()));
        String ar[][]=new String[x][y];
        int i=-1;
        for(int xa=0;xa<x;xa++)
        {
            for(int ya=0;ya<y;ya++)
            {
                ar[xa][ya]=""+a.charAt(++i);
            }
        }
        
        s="";
                           
        for(int ya=0;ya<y;ya++)
        {
            for(int xa=0;xa<y;xa++)
            {
                System.out.print(ar[xa][ya]);
                if(!ar[xa][ya].equals("0"))
                {
                    s=s+ar[xa][ya];   
                }
            }
            s=s+" ";
        }
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
