import java.util.Scanner;

public class BasicInput
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!, Hakuna Matata");
        }
    }
}