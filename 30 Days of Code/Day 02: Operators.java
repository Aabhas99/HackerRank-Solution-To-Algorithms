import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      double s=mealCost*tipPercent/100;
        double ss=mealCost*taxPercent/100;
        ss=mealCost+ss+s;
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(ss);
      System.out.println("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}
