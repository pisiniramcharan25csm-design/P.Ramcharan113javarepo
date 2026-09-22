import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        fibonacci(0, 1, n);
        sc.close();
    }
    static void fibonacci(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }

        System.out.print(a + " ");

        fibonacci(b, a + b, n - 1);
    }

}