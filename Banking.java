import java.util.*;
public class Banking{
    static Scanner sc = new Scanner(System.in);
    static double bal=0;
    public static void main(String[] args)
    {
        int ch;
        
        do
        {
            System.out.println("************");
            System.out.println("BANKING PROGRAM");
            System.out.println("************");
            System.out.println("1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            System.out.println("************");
            System.out.print("Enter your choice(1-4):");
            ch =sc.nextInt();
            switch(ch)
            {
                case 1 : 
                        System.out.println(showBalance());
                        break;
                case 2 :
                         deposit();
                         break;
                case 3 :
                         withdraw();
                         break;
                case 4 :
                         System.exit(0);
                default :
                        System.out.println("invalid choice");
            }
        }
        while(ch!=4);
    }
    static double showBalance()
    {
        System.out.println("************");
        return bal;
    }
    static void deposit()
    {
        System.out.println("************");
        System.out.print("Enter amount to be deposited:");
        double amount = sc.nextDouble();
        if(amount<=0)
            System.out.println("Amount cannot be negative");
        else
            bal=bal+amount;
    }
    static void withdraw()
    {
        System.out.print("Enter amount to be withdrawn:");
        double with = sc.nextDouble();
        if(with>bal)
            System.out.println("INSUFFICIENT BALANCE!");
        else if(with<0)
            System.out.println("Amount cannot be negative");
        else
            bal=bal-with;
    }
}
