import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        while (q-- > 0) {
            long n = in.nextLong();
            int count = 0;
            long product = 1;
            for (int i : prime) {
                product *= i;
                if (product <= n) {
                    count++;
                }
            }
            System.out.println(count);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
