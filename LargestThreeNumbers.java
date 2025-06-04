import java.util.Scanner;

public class LargestThreeNumbers
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int large = largestNum(x, y, z);
            System.out.println("The largest number is: " + large);
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