import java.util.Scanner;
import java.util.Random;
public class DiceRoll
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.print("Enter the number of dice to roll:");
        int roll = sc.nextInt();
        int total=0;
        if(roll>0)
        {
            for(int i=0;i<roll;i++)
            {
                int diceNo=rn.nextInt(1,7);
                System.out.println("You rolled: "+diceNo);
                total+=diceNo;
                rolled(diceNo);
            }
            System.out.println("Total:"+total);
        }
        else
        {
            System.out.println("Can't be less than zero");
        }
        sc.close();
    }
    static void rolled(int rolled)
    {
        String dice1 = """
                  -----------
                |             |
                |             |
                |      ●      |
                |             |
                |             |
                  -----------  
                """;
        String dice2 = """
                  -----------
                |             |
                |             |
                |   ●     ●   |
                |             |
                |             |
                  -----------  
                """;
        String dice3 = """
                  -----------
                |             |
                |   ●     ●   |
                |      ●      |
                |             |
                |             |
                  -----------  
                """;
        String dice4 = """
                  -----------
                |             |
                |   ●     ●   |
                |             |
                |   ●     ●   |
                |             |
                  -----------  
                """;
        String dice5 = """
                  -----------
                |             |
                |  ●      ●   |
                |      ●      |
                |  ●      ●   |
                |             |
                  -----------  
                """;
        String dice6 = """
                  -----------
                |             |
                |   ●  ●  ●   |
                |   ●  ●  ●   |
                |   ●  ●  ●   |
                |             |
                  -----------  
                """;
        switch(rolled)
        {
            case 1->System.out.println(dice1);
            case 2->System.out.println(dice2);
            case 3->System.out.println(dice3);
            case 4->System.out.println(dice4);
            case 5->System.out.println(dice5);
            case 6->System.out.println(dice6);
            default->System.out.println("INVALID");
        }
    }
}