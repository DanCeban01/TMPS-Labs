package breaking_bad_simulation.composite;

import breaking_bad_simulation.composite.abstractions.LetterComposite;

public class Letter extends LetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printBefore(){
        System.out.print(c);
    }

    @Override
    protected void printAfter(){
    }
}
