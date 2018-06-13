import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for(int x=1;x<=10;x++)
        {
            System.out.println(n+" x "+x+" = "+(n*x));
        }
    }
}
