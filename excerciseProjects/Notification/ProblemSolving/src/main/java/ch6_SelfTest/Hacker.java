package ch6_SelfTest;

 class PetPair
{
    private NewPet first, second;
    public PetPair(NewPet firstPet, NewPet secondPet)
    {
        first = firstPet;
        second = secondPet;
    }
    public NewPet getFirst()
    {
        return first;
    }
    public NewPet getSecond()
    {
        return second;
    }
    public void writeOutput()
    {
        System.out.println("First pet in the pair:");
        first.writeOutput();
        System.out.println("\nSecond pet in the pair:");
        second.writeOutput();
    }
}

public class Hacker {
    public static void main(String[] args)
    {
        NewPet goodDog = new NewPet("Faithful Guard Dog", 5, 75.0);
        NewPet buddy = new NewPet("Loyal Companion", 4, 60.5);
        PetPair pair = new PetPair(goodDog, buddy);
        System.out.println("Our pair:");
        pair.writeOutput( );
        NewPet badGuy = pair.getFirst();
        badGuy.setPet("Dominion Spy", 1200, 500);
        System.out.println("\nOur pair now:");
        pair.writeOutput( );
        System.out.println("The pet wasn't so private!");
        System.out.println("Looks like a security breach.");
    }
}
