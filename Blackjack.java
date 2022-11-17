import java.util.Scanner;

public class Blackjack 
{
    public static void main(String[] args) throws InterruptedException
    {
        String isPlayingAgain = "y";
        Deck aDeck = new Deck();
        Scanner console = new Scanner(System.in);

        while (isPlayingAgain.equals("y"))
        {
            int houseTotal = aDeck.drawCard().getValue(true) + aDeck.drawCard().getValue(true);
            int playerTotal = aDeck.drawCard().getValue(true) + aDeck.drawCard().getValue(true);

            System.out.println("The House is showing: " + houseTotal);

            while (playerTotal < 22)
            {
                Thread.sleep(500);
                System.out.println("Players total is: " + playerTotal);
                System.out.print("Would you like to hit (1) or stand (0)? ");
                int playerChoice = console.nextInt();
                console.nextLine();

                if (playerChoice == 0)
                {
                    break;
                }
                else if (playerChoice == 1)
                {
                    Card nextCard = aDeck.drawCard();
                    Thread.sleep(500);
                    System.out.println("The player has been dealt " + nextCard.declareCard());
                    playerTotal += nextCard.getValue(true);
                    Thread.sleep(500);

                }
                else 
                {
                    System.out.println("Invalid option, try again.");
                } // end if
            } // end while loop

            if (playerTotal > 21)
            {
                System.out.println("The player is busted! You lose.");
            }
            else 
            {
                System.out.println("The player stands with " + playerTotal);
                System.out.println("The House will play next.\n");
            }

            while (houseTotal < 22)
            {
                if (houseTotal >= 17 && houseTotal <= 21)
                {
                    Thread.sleep(500);
                    System.out.println("The House stands with " + houseTotal);
                    break;
                }
                else // (houseTotal < 17)
                {
                    Thread.sleep(500);
                    Card nextCard = aDeck.drawCard();
                    System.out.println("The House has " + houseTotal);
                    System.out.println("The House takes another card.");
                    System.out.println("The House has been dealt " + nextCard.declareCard());
                    houseTotal += nextCard.getValue(true);
                    Thread.sleep(500);
                } // end if
            } // end while loop

            if (houseTotal == 21)
            {
                break;
            }
            else if (houseTotal > 21)
            {
                if (playerTotal > 21)
                {
                    System.out.println("The House busted, but so did you. You lose!");
                }
            System.out.println("The House is busted! You win!");
            }   
            else if (houseTotal > playerTotal)
            {
                System.out.println("The House's total exceed's the player's! You lose.");
            }
            else if (playerTotal > houseTotal && playerTotal <= 21)
            {
                System.out.println("The player's total exceed's the House's. You win!");
            }
            else 
            {
                if (playerTotal > 21)
                {
                    break;
                }
                System.out.println("The player and the House have the same total. It's a tie.");
            } // end if
            
            System.out.print("Would you like to play again? (y/n): ");
            String playAgain = console.nextLine();
            if (playAgain.equals("n"))
            {
                isPlayingAgain = "n";
            } // end if
        } // end while loop

        if (isPlayingAgain.equals("n"))
        {
            System.out.println("\nSore loser or just tired? Either way, see ya!");
        } // end if
        console.close();
    } // end main()
} // end class
