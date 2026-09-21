import java.util.*;

public class Calculator
{
    static Scanner sc = new Scanner(System.in);

    static void addition()
    {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Result = " + (a + b));
    }

    static void subtraction()
    {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Result = " + (a - b));
    }

    static void multiplication()
    {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Result = " + (a * b));
    }

    static void division()
    {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if(b != 0)
        {
            System.out.println("Result = " + (a / b));
        }
        else
        {
            System.out.println("Cannot divide by zero!");
        }
    }

    static void modulus()
    {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if(b != 0)
        {
            System.out.println("Result = " + (a % b));
        }
        else
        {
            System.out.println("Cannot find modulus with zero!");
        }
    }

    public static void main(String[] args)
    {
        int ch;

        do
        {
            System.out.println();
            System.out.println("********************************");
            System.out.println("         CALCULATOR");
            System.out.println("********************************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.println("********************************");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    addition();
                    break;

                case 2:
                    subtraction();
                    break;

                case 3:
                    multiplication();
                    break;

                case 4:
                    division();
                    break;

                case 5:
                    modulus();
                    break;

                case 6:
                    System.out.println("Thank you for using Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        }while(ch != 6);
    }
}