public class Card 
{
    private int value;
    private String suit;

    public Card(int _value, String _suit)
    {
        this.value = _value;
        this.suit = _suit;
    }

    public String getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        return value;
    }
    
    public int getValue(boolean isBlackjack)
    {
        if (!isBlackjack)
        {
            return value;
        }
        else
        {
            if (value == 1)
            {
                return 11;
            }
            else if (value > 10)
            {
                return 10;
            }
            else 
            {
                return value;
            }
        }
    }
    
    public String declareCard()
    {
        if (this.value == 11)
        {
            return "the Jack of " + suit;
        }
        else if (this.value == 12)
        {
            return "the Queen of " + suit;
        }
        else if (this.value == 13)
        {
            return "the King of " + suit;
        }
        else if (this.value == 1)
        {
            return "the Ace of " + suit;
        }
        else 
        {
            return "the " + value + " of " + suit;
        }
    }
} // end class
