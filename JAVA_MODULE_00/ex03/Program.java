import java.util.Scanner;

public class Program {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String currentWeek;
        int i = 0;
        int min = 0;
        long hold = 0;
        while (!line.equals("42"))
        {
            if (i >= 18)
            {
                line = scanner.nextLine();
                continue;
            }
            currentWeek = "Week " + (i + 1);
            if (currentWeek.equals(line) == false)
            {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            min = scanner.nextInt();
            int j = 0;
            while (j < 4)
            {
                int tmp = scanner.nextInt();
                if (tmp < min)
                    min = tmp;
                j++;
            }
            int tmp = 0;
            long tenSquare = 1;
            while (tmp++ < i)
                tenSquare = tenSquare * 10;
            // hold = hold + min*(10^i)
            hold = hold + min * (tenSquare);
            i++;
            // nextInt() reads the number but leaves the '\n' at the end of the line.
            // Consume it to move the scanner position to the next line.
            scanner.nextLine();
            // Now read the next line properly.
            line = scanner.nextLine();
        }
        i = 0;
        while (hold != 0)
        {

            min = (int) (hold % 10);
            currentWeek = "Week " + (i + 1) + " ";
            System.out.print(currentWeek);
            int k = 0;
            while (k++ < min)
                System.out.print("=");
            System.out.println(">");
            i++;
            hold /= 10;
        }
    }
}
