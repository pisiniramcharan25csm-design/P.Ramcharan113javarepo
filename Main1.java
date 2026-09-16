import java.util.Scanner;
import java.util.Random;
public class Main1
{
    public static void main(String[] args) 
    {
         System.out.println("Number guessing game");
        System.out.println("Guess a number between 1-10:");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int randomNumber = rn.nextInt(1,11);
        int guess,att=0;
        do{
            System.out.print("Enter a guess:");
            guess = sc.nextInt();
            att++;
            if(guess<randomNumber)
                System.out.println("TOO LOW Try again");
            else if (guess>randomNumber)
                System.out.println("TOO HIGH Try again");
            else
                System.out.println("Correct!! the number was "+randomNumber+"\nIn "+att+"Attempts");
        }
        while(guess!=randomNumber);
        sc.close();
    }
}   
