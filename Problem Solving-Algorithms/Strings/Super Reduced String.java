import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        int l=s.length();
        int x=0;
       while(x<s.length()-1)
       {
            char ch1=s.charAt(x);
                       char ch2=s.charAt(x+1);
           if(ch1==ch2)
           {
               String t=s.substring(0,x);
               if(!(x+2==s.length()))
               {
                    t=t+s.substring(x+2);
               }
               x=0;
               s=t;
               continue;
           }
            x++;
       }
        if(s.equals(""))
        {
            System.out.println("Empty String");
        }
        return s;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
