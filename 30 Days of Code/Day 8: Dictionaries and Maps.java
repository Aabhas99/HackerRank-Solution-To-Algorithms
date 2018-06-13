//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> m=new HashMap<>();
        for(int i = 0; i < n; i++){
            m.put(in.next(),new Integer(in.nextInt()));
        }
        while(in.hasNext()){
            String s = in.next();
            if(m.containsKey(s))
            {
                System.out.println(s+"="+m.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
