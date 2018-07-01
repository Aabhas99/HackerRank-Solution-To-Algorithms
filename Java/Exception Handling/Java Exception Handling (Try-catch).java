import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            try
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int a=x/y;
                System.out.println(x/y);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            catch(InputMismatchException e)
            {
                String s=e.toString();
                if(s.contains(":"))
                 System.out.println(s.substring(0,s.indexOf(':')));
                else
                    System.out.println(s);
            }
            
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
