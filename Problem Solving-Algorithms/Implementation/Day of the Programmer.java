import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        int x=0;
        int y=year;
        int d[]={31,30,31,30,31,31};
        
        if(y==1918)
        {
            x=46;
        }
        else if(y<1918)
        {
            if(y%4==0)
            {
                x=31+29;
            }
            else
            {
                x=31+28;
            }
        }
        else
        {
            if(y%400==0||(y%4==0&&y%100!=0))
            {
                x=31+29;
            }
            else
            {
                x=31+28;
            }
        }
        for(int z=0;z<=5;z++)
        {
            x=x+d[z];
        }
        return ((256-x)+".09."+y);
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
