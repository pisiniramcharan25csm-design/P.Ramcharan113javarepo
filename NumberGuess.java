import java.util.*;
public class NumberGuess {
    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();
    public static void main(String[] args)
    {
        int ch;
        do
        {
            System.out.println();
            System.out.println();
            System.out.println("========== NUMBER GUESSING GAME ==========");
            System.out.println("==========        RULES         ==========");
            System.out.println("\nEasy->   10 attempts\nMedium-> 07 attempts\nHard->   05 attempts");
            System.out.println("\n1.Easy\n2.Medium\n3.Hard\n4.Exit");
            System.out.print("\nEnter difficulty:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1->easy();
                case 2->medium();
                case 3->hard();
                case 4->System.exit(0);
                default->System.out.println("\nInavalid choice!!!");
            }
        }
        while(ch!=4);
        sc.close();
    }
    static void easy()
    {
        int atmp=10,num1,randomNum1=rn.nextInt(1,101);
        boolean correct = false;
        System.out.println("\nYou have 10 attempts.");
        do{
            System.out.print("\nGuess a number between 1 and 100:");
            num1=sc.nextInt();
            if(num1<1||num1>100)
                System.out.println("\nGUESS A NUMBER BETWEEN (1-100)!!");
            else if(num1<randomNum1)
            {
                System.out.println("TOO Low!!");
                atmp--;
                System.out.println("Attempts remaining:"+atmp);
            }
            else if(num1>randomNum1)
            {
                System.out.println("TOO High!!");
                atmp--;
                System.out.println("Attempts remaining:"+atmp);
            } 
            else if(num1==randomNum1)
            {
                System.out.println("Correct!!");
                System.out.println("The number was:"+randomNum1);
                System.out.println("Wrong Attempts:"+(10-atmp));
                correct=true;
            }
        }
        while(atmp>0&&!correct);
        if(!correct)
        {
            System.out.println("\nGAME OVER!!!!");
            System.out.println("The correct number was:"+randomNum1);
        } 
    }
    static void medium()
    {
        int atmp=7,num2,randomNum2=rn.nextInt(1,101);
        boolean correct = false;
        System.out.println("\nYou have 7 attempts.");
        do
        {
            System.out.print("\nGuess a number between 1 and 100:");
            num2=sc.nextInt();
            if(num2<1||num2>100)
                System.out.println("\nGUESS A NUMBER BETWEEN (1-100)!!");
            else if(num2<randomNum2)
            {
                System.out.println("TOO Low!!");
                atmp--;
                System.out.println("Attempts remaining:"+atmp);
            }
            else if(num2>randomNum2)
            {
                System.out.println("TOO High!!");
                atmp--;
                System.out.println("Attempts remaining:"+atmp);
            } 
            else if(num2==randomNum2)
            {
                System.out.println("Correct!!");
                System.out.println("The number was:"+randomNum2);
                System.out.println("Wrong Attempts:"+(7-atmp));
                correct=true;
            }
        }
        while(atmp>0&&!correct);
        if(!correct)
        {
            System.out.println("\nGAME OVER!!!!");
            System.out.println("The correct number was:"+randomNum2);
        } 
    }
    static void hard()
    {
        int atmp=5,num3,randomNum3=rn.nextInt(1,101);
        boolean correct = false;
        System.out.println("\nYou have 5 attempts.");
        do
        {
            System.out.print("\nGuess a number between 1 and 100:");
            num3=sc.nextInt();
            if(num3<1||num3>100)
                System.out.println("\nGUESS A NUMBER BETWEEN (1-100)!!");
            else if(num3<randomNum3)
            {
                System.out.println("TOO Low!!");
                atmp--;
                System.out.println("Attempts remaining:"+atmp);
            }
            else if(num3>randomNum3)
            {
                System.out.println("TOO High!!");
                atmp--;
                System.out.println("Attempts remaining:"+atmp);
            } 
            else if(num3==randomNum3)
            {
                System.out.println("Correct!!");
                System.out.println("The number was:"+randomNum3);
                System.out.println("Wrong Attempts:"+(5-atmp));
                correct=true;
            }
        }
        while(atmp>0&&!correct);
        if(!correct)
        {
            System.out.println("GAME OVER!!!!");
            System.out.println("The correct number was:"+randomNum3);
        } 
    }
}
