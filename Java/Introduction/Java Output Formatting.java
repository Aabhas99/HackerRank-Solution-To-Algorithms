import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int y=sc.nextInt();
                System.out.print(s1);
                for(int x=s1.length();x<15;x++)
                {
                    System.out.print(" ");
                }
                if(y<10)
                {
                    System.out.println("00"+y);
                }
                else if(y<100)
                {
                    System.out.println("0"+y);
                }
                else
                {
                    System.out.println(y);
                }
                //Complete this line
            }
            System.out.println("================================");

    }
}
