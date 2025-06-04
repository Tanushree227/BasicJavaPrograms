import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestThreeNumbers
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            //Finding largest number using if else 
            //int large = largestNum(x, y, z);
            //System.out.println("The largest number is: " + large);

            // Finding largest number using collections
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(x);
            numbers.add(y);
            numbers.add(z);

            System.out.println("The Largest number is: " +Collections.max(numbers));
        }
    }

    public static int largestNum(int a, int b, int c)
    {
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}