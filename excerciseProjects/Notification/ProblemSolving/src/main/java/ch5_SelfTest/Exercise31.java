package ch5_SelfTest;

public class Exercise31 {

    public void mystery(Species s, int m) {
        s.setSpecies("Klingon ox", 10, 15);
        m = 42;
    }

    public static void main(String[] args) {
        Species s1 = new Species();
        Exercise31 mysteryMaker = new Exercise31();
        int n = 0;
        s1.setSpecies("Hobbit", 100, 2);
        mysteryMaker.mystery(s1, n);
        s1.writeOutput();
        System.out.println("n = " + n);
    }
}

