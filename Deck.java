public class Deck 
{
    public Card drawCard()
    {
        int randomValue = (int) (Math.random() * 13) + 1;
        int randomSuit = (int) (Math.random() * 4) + 1;
        String suit;

        if (randomSuit == 1)
        {
            suit = "Spades";
        }
        else if (randomSuit == 2)
        {
            suit = "Clubs";
        }
        else if (randomSuit == 3)
        {
            suit = "Hearts";
        }
        else
        {
            suit = "Diamonds";
        }

        return new Card(randomValue, suit);
    }
} // end class
