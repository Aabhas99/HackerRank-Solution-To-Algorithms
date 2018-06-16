import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        int ar[]=new int[2];
        int l=score[0];
        int s=score[0];
        int lc=0,sc=0;
        for(int x=1;x<score.length;x++)
        {
            if(score[x]>l)
            {
                l=score[x];
                lc++;
            }
            if(score[x]<s)
            {
                s=score[x];
                sc++;
            }
        }
        ar[0]=lc;
        ar[1]=sc;
        return ar;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
