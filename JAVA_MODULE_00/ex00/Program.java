public class Program {
    public static void main (String[] args)
    {
        // number must be positive guys ! no need to make a stupid negative check for positive numbers
        int x = 54321;
        int sum = 0;
        while (true)
        {
            // System.out.printf("+%d = ", x % 10);
            sum += x % 10;
            x /= 10;
            if (x == 0)
                break;
            
        }
        System.out.println(sum);
    }
}