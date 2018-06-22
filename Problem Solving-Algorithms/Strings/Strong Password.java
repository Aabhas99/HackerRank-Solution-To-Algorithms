import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
       String numbers = "0123456789";
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String special_characters = "!@#$%^&*()-+";
           int c=0;
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        
        for(int x=0;x<n;x++)
        {
            String s=(password.charAt(x)+"");
            if(numbers.contains(s))
            {
                i++;
            }
            if(lower_case.contains(s))
            {
                j++;
            }
            if(upper_case.contains(s))
            {
                k++;
            }
            if(special_characters.contains(s))
            {
                l++;
            }
        }
        if(i==0)
        {
            c++;
        }
        if(j==0)
        {
            c++;
        }
        if(k==0)
        {
            c++;
        }
        if(l==0)
        {
            c++;
        }
        if(c+n<6)
        {
            c=c+6-(c+n);
        }
        return c;
        // Return the minimum number of characters to make the password strong
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
