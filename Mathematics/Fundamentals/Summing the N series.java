import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            long a=sc.nextLong();
            System.out.println(((a%1000000007l)*(a%1000000007l))%1000000007l);
        }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
}
