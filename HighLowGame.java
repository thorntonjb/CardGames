import java.util.Scanner;

public class HighLowGame 
{
    public static void main(String[] args)
    {
        String isPlayingAgain = "y";
        Scanner console = new Scanner(System.in);

        while (isPlayingAgain.equals("y"))
        {
            Deck aDeck = new Deck();
            

            Card firstCard = aDeck.drawCard();
            System.out.println("The first card is " + firstCard.declareCard());
            System.out.println("Will the next card be higher or lower?");
            System.out.print("Enter 1 if lower, 2 if higher: ");

            int userChoice = console.nextInt();

            Card secondCard = aDeck.drawCard();
            System.out.println("The next card is " + secondCard.declareCard());

            boolean isHigher = secondCard.getValue() > firstCard.getValue();
            if (firstCard.getValue() == secondCard.getValue())
            {
                System.out.println("The next card is of the same value. You tied!");
            }
            else if ((isHigher && userChoice == 2) || (!isHigher && userChoice == 1))
            {
                System.out.println("You chose correctly! You win!");
            }
            else
            {
                System.out.println("Loser.");
            } // end if

            
            System.out.print("\nWould you like to play again? (1 for yes / 2 for no): ");
            int playAgain = console.nextInt();

            if (playAgain == 2)
            {
                isPlayingAgain = "n";
            }
            else
            {
                isPlayingAgain = "y";
            } // end if

            
        } // end while loop
            console.close();
    } // end main()
} // end class
