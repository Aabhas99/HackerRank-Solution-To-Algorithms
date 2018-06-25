import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the connectedCell function below.
    static int connectedCell(int[][] matrix) {
    
        int b=0;
    for(int x=0;x<matrix.length;x++)
    {
        for(int y=0;y<matrix[0].length;y++)
        {
            if(matrix[x][y]==1)
            {
                int i=y;
                int l=1;
                Queue<Integer> q=new LinkedList<>();
                q.add(x*10+i);
                while(!q.isEmpty())
                {
                    int w=q.remove();
                    int xa=w/10;
                    int ia=w%10;
                    matrix[xa][ia]=-1;
                    if(ia!=matrix[0].length-1&&matrix[xa][ia+1]==1&&!q.contains(xa*10+ia+1))
                    {
                        q.add(xa*10+ia+1);
                        l++;
                    }
                    if(x!=0&&ia!=matrix[0].length-1&&matrix[xa-1][ia+1]==1&&!q.contains((xa-1)*10+ia+1))
                    {
                        q.add((xa-1)*10+ia+1);
                        l++;
                    }
                    if(x!=0&&ia!=0&&matrix[xa-1][ia-1]==1&&!q.contains((xa-1)*10+ia-1))
                    {
                        q.add((xa-1)*10+ia-1);
                        l++;
                    }
                    if(ia!=0&&matrix[xa][ia-1]==1&&!q.contains((xa)*10+ia-1))
                    {
                        q.add((xa)*10+ia-1);
                        l++;
                    }
                    if(xa!=0&&matrix[xa-1][ia]==1&&!q.contains((xa-1)*10+ia))
                    {
                        q.add((xa-1)*10+ia);
                        l++;
                    }
                    if(xa!=matrix.length-1)
                    {
                        if(ia!=matrix[0].length-1&&matrix[xa+1][ia+1]==1&&!q.contains((xa+1)*10+ia+1))
                        {
                            q.add((xa+1)*10+ia+1);
                            l++;
                        }
                        if(ia!=0&&matrix[xa+1][ia-1]==1&&!q.contains((xa+1)*10+ia-1))
                        {
                            q.add((xa+1)*10+ia-1);
                            l++;
                        }
                        if(matrix[xa+1][ia]==1&&!q.contains((xa+1)*10+ia))
                        {
                            q.add((xa+1)*10+ia);
                            l++;
                        }
                    }
                }
                if(i>=0)
                {

                    if(l>b)
                    {
                        b=l;
                    }
                }
            }
        }
        
        
    }
        return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] matrixRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int matrixItem = Integer.parseInt(matrixRowItems[j]);
                matrix[i][j] = matrixItem;
            }
        }

        int result = connectedCell(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
