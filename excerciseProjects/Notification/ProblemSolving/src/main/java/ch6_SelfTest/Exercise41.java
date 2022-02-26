package ch6_SelfTest;

enum Suit
{
    CLUBS("black"), DIAMONDS("red"), HEARTS("red"),
    SPADES("black");
    private final String color;
    private Suit(String suitColor)
    {
        color = suitColor;
    }
    public String getColor()
    {
        return color;
    }
}

public class Exercise41 {
    public static void main(String[] args) {
//        a. cardSuit.ordinal()
//        b. cardSuit.equals(Suit.CLUBS)
//        c. cardSuit.compareTo(Suit.CLUBS)
//        d. Suit.valueOf("CLUBS")
//        e. Suit.valueOf(cardSuit.toString())
//        f. cardSuit.getColor()
//        g. cardSuit.toString()
    }
}
