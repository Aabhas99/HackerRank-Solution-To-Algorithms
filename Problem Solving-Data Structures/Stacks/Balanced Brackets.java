import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String sa) {
    Stack<Character> s=new Stack<>();
        int si=-1;
        for(int x=0;x<sa.length();x++)
        {
            char ch=sa.charAt(x);
            if(ch=='{'||ch=='['||ch=='(')
            {
                s.push(ch);
                si++;
            }
            else
            {
                if(s.isEmpty())
                {
                   return "NO";
                }
                if(((char)s.peek()=='('&&ch==')')||((char)s.peek()=='{'&&ch=='}')||((char)s.peek()=='['&&ch==']'))
                {
                    s.pop();
                    si--;
                }
                else
                {
                    return "NO";
                }
            }
        }
        if(s.isEmpty())
        {
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
