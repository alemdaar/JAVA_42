public class Program {
    public static void main (String[] args)
    {
        int x = 479598;
        int sum = x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        System.out.println(sum);
    }
}