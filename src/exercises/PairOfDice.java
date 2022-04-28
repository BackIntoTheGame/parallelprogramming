package exercises;

public class PairOfDice {
    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.
    private int counter =0;
    public PairOfDice(int val1, int val2) {
        // Constructor.  Creates a pair of dice that
        // are initially showing the values val1 and val2.
        die1 = val1;  // Assign specified values
        die2 = val2;  //           to the instance variables.
    }

    public PairOfDice(){
        roll();
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        counter++;
    }

    @Override
    public String toString() {
        return "This dice has been rolled for " + counter + " times";
    }

    public static void main(String[] args) {
        PairOfDice pd = new PairOfDice();
        do {
            pd.roll();
        } while(pd.getDie1()+pd.getDie2() != 2);
        System.out.println(pd);
    }
} // end class PairOfDice