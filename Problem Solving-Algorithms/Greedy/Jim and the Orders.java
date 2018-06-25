import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void jimOrders(int[][] orders) {
        List<Integer> l=new ArrayList<>();
        List<Integer> la=new ArrayList<>();
        for(int x=0;x<orders.length;x++)
        {
            l.add(orders[x][0]+orders[x][1]);
            la.add(orders[x][0]+orders[x][1]);
        }
        Collections.sort(l);
        for(int x=0;x<orders.length;x++)
        {
            Integer a=l.get(x);
            System.out.print((la.indexOf(a)+1)+" ");
            la.set(la.indexOf(a),-1);
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] orders = new int[n][2];
        for(int orders_i = 0; orders_i < n; orders_i++){
            for(int orders_j = 0; orders_j < 2; orders_j++){
                orders[orders_i][orders_j] = in.nextInt();
            }
        }
        jimOrders(orders);
        in.close();
    }
}
