import java.util.Scanner;

public class Program {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] weeks = {"Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7", "Week 8",
            "Week 9", "Week 10", "Week 11", "Week 12", "Week 13",
            "Week 14", "Week 15", "Week 16", "Week 17", "Week 18"};
        int i = 0;
        int min = 0;
        int hold = 0;
        while (!line.equals("42"))
        {
            if (i >= 18)
                continue;
            if (weeks[i].equals(line) == false)
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
            hold = (hold * 10) + (min);
            i++;
            line = scanner.nextLine();
        }
        i = 0;
        while ((hold / 10) != 0)
            {
                min = hold % 10;
                System.out.printf("Week %d\n", i + 1);
                int k = 0;
                while (k++ < min)
                    System.out.print("=");
                i++;
            hold /= 10;
        }
        System.out.println(">");
    }
}