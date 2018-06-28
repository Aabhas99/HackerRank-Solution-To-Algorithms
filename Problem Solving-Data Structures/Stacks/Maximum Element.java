import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        Stack<Integer> sa=new Stack<>();
        int n=sc.nextInt();
        int size=-1;
        for(int x=0;x<n;x++)
        {
            int a=sc.nextInt();
            if(a==1)
            {
                int q=sc.nextInt();
                s.push(new Integer(q));
                if(size==-1)
                {
                    sa.push(q);
                }
                else
                {
                    if(q>sa.peek())
                    {
                        sa.push(q);
                    }
                    else
                    {
                        sa.push(sa.peek());
                    }
                }
                size++;
            }
            else if(a==2)
            {
                s.pop();
                sa.pop();
                size--;
            }
            else
            {
                System.out.println(sa.peek());
            }
        }
    }
}
