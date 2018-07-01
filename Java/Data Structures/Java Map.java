//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n =Integer.parseInt(br.readLine());
        HashMap<String,Integer> m=new HashMap<>();
        for(int i = 0; i < n; i++){
            m.put(br.readLine(),new Integer(Integer.parseInt(br.readLine())));
        }
        while(true){
            String s = br.readLine();
            if(s.equals(""))
            {
                break;
            }
            if(m.containsKey(s))
            {
                System.out.println(s+"="+m.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        
    }
}
