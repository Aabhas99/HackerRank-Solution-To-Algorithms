

public class Solution {
    public static String getDay(String day, String month, String year) {
       int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String da[]={"SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
        int a=-1;
        int y=Integer.parseInt(year);
        int m=Integer.parseInt(month);
        int d=Integer.parseInt(day);
            if(y>2000)
            {
               
                a=a+(y-2000-1)/4+(365*(y-2000))+1;
            }
            for(int x=0;x<m-1;x++)
            {
                if(y%400==0||(y%4==0&&y%100!=0))
                {
                    if(m>=2&&x==1)
                    {
                                a=a+29;
                    }
                        else
                        {
                            a=a+ar[x];
                        }
                }
                 else
                 {
                     a=a+ar[x];
                 }
            }
            a=a+d;
        return da[a%7];
        /*
        * Write your code here.
        */
        
    }
