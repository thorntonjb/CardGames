import java.util.Scanner;

public class GameSelection 
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Hello user! Which game would you like to play?");
        System.out.print("HighLow (1) or Blackjack (2)?: ");
        int userChoice = console.nextInt();
        Blackjack newGame = new Blackjack();
        HighLowGame startGame = new HighLowGame();
        
        if (userChoice == 1)
        {
            System.out.println("You have selected HighLow. Starting game...");
            Thread.sleep(1000);
            startGame.playHighLow();
        }
        else if (userChoice == 2)
        {
            System.out.println("You have selected Blackjack. Starting game...");
            Thread.sleep(1000);
            newGame.playBlackjack();
        }
        else 
        {
            System.out.println("Invalid option. You only had two choices!");
        }

        console.close();
    } // end main()

} // end class
