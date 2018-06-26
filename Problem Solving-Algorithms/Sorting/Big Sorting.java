import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int partition(String arr[], int low, int high)
    {
        String pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j].length()==pivot.length())
            {
                if(arr[j].compareTo(pivot)<0)
                {
                    i++;
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            else if(arr[j].length()<pivot.length())
            {
                    i++;
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    static void sort(String arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int x=0;x<n;x++)
        {
            s[x]=sc.next();
        }
        sort(s,0,s.length-1);
        for(int x=0;x<s.length;x++)
            {
                System.out.println(s[x]);
            }
        sc.close();
    }
}
