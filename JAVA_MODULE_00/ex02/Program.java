import java.util.Scanner;

public class Program {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        // since the value is not 42 that means we didnt reach the EOF
        int number = 0;
        while ((number = scanner.nextInt()) != 42)
        {
            // we set the sum to 0 bc its the variable that we will get the values 
            // of each single number in the number and increament each time
            int each = 0;
            boolean sign = true;
            // we will loop over the number to keep divide it each time to 10 
            // till we get 0 so we know its the last part
            // and in the same time we take the reminder of number % 10
            while (number != 0)
            {
                each += number % 10;
                number /= 10;
            }
            // now we will see if the number is prime
            int iterations = 2;
            while ((iterations * iterations) <= each)
            {
                if (each % iterations == 0) {
                    sign = false;
                    break;
                }
                iterations++;
            }
            if (sign == false)
                continue;
            count ++;
        }
        System.out.print("Count of coffee-request : ");
        System.out.println(count);
    }
}