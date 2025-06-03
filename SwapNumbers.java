import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("First Number: "+x+", Second Number: "+y);
        
        System.out.println("Menu: ");
        System.out.println("1. Swap using temporary variable(creating auxiliary memory)");
        System.out.println("2. Swap using without temporary variable");
        System.out.println("3. Swap using exclusive OR operator");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int temp = x;
                x = y;
                y = temp;
                System.out.println("After swapping using temporary variable: First Number: " + x + ", Second Number: " + y);
                break;

            case 2:
                x = x + y;
                y = x - y;
                x = x - y;
                System.out.println("After swapping without temporary variable: First Number: " + x + ", Second Number: " + y);
                break;

            case 3:
                x = x ^ y;
                y = x ^ y;
                x = x ^ y;
                System.out.println("After swapping using exclusive OR operator: First Number: " + x + ", Second Number: " + y);
                break;
            
            case 4:
                System.out.println("Exiting the program.");
                sc.close();
                return;
        
            default:
                break;
        }
    }
}
