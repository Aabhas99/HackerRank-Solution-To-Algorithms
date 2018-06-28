import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        for(int x=0;x<n;x++)
        {
            int a=sc.nextInt();
            if(a==1)
            {
                q.add(sc.nextInt());
            }
            else if(a==2)
            {
                q.remove();
            }
            else
            {
                System.out.println(q.peek());
            }
        }
    }
}
