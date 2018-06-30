import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.equals(""))
        {
            System.out.println("0");
            return;
        }
        String ar[]=s.split("[\\s!,?._'@]+");
        System.out.println(ar.length);
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]);
        }
        // Write your code here.
        scan.close();
    }
}
