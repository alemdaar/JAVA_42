import java.util.Scanner;

public class Program {
    public static void main (String[] args)
    {
        int iterations = 2;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        while ((iterations * iterations) <= number)
        {
            System.out.println(number % iterations);
            if (number % iterations == 0)
            {
                System.out.print("false ");
                System.out.println(iterations - 1);
                return;
            }
            iterations++;
        }
        System.out.print("true ");
        System.out.println(iterations - 1);
    }
}