import java.util.Scanner;

public class HighLowGame 
{
    public void playHighLow()
    {
        String isPlayingAgain = "y";
        Scanner console = new Scanner(System.in);

        while (isPlayingAgain.equals("y"))
        {
            Deck aDeck = new Deck();
            

            Card firstCard = aDeck.drawCard();
            System.out.println("The first card is " + firstCard.declareCard());
            System.out.println("Will the next card be higher or lower?");
            System.out.print("Enter 1 if higher, 2 if lower: ");

            int userChoice = console.nextInt();
            console.nextLine();

            Card secondCard = aDeck.drawCard();
            System.out.println("The next card is " + secondCard.declareCard());

            boolean isHigher = secondCard.getValue() > firstCard.getValue();
            if (firstCard.getValue() == secondCard.getValue())
            {
                System.out.println("The next card is of the same value. You tied!");
            }
            else if ((isHigher && userChoice == 1) || (!isHigher && userChoice == 2))
            {
                System.out.println("You chose correctly! You win!");
            }
            else
            {
                System.out.println("Loser.");
            } // end if

            
            System.out.print("\nWould you like to play again? (y/n): ");
            String playAgain = console.nextLine();

            if (playAgain.equalsIgnoreCase("n"))
            {
                isPlayingAgain = "n";
            }
            else if (playAgain.equalsIgnoreCase("y"))
            {
                isPlayingAgain = "y";
            }
            else // (!playAgain.equalsIgnoreCase("n") || !playAgain.equalsIgnoreCase("y"))
            {
                System.out.println("Invalid option. Please choose again.");
            }

            
        } // end while loop
            console.close();
    } // end main()
} // end class
