import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the dynamicArray function below.
     */
    static int[] dynamicArray(int n, int[][] queries) {
        List<Integer> ar[]=new ArrayList[n];
        int arr[]=new int[n];
        int i=-1;
        int l=0;
        for(int x=0;x<n;x++)
        {
            ar[x]=new ArrayList<>();
        }
        for(int x=0;x<queries.length;x++)
        {
            int a=(queries[x][1]^l)%n;
            if(queries[x][0]==1)
            {
                ar[a].add(new Integer(queries[x][2]));
                
            }
            
            else
            {
                
                    int w=ar[a].size();
                    l=(int)ar[a].get(queries[x][2]%w);
                arr[++i]=l;
            }
        }
        
        return arr;
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[][] queries = new int[q][3];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = dynamicArray(n, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            if(result[resultItr]==0)
            {
                break;
            }
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
