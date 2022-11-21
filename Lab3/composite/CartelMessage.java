package breaking_bad_simulation.composite;

import breaking_bad_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartelMessage {

    public LetterComposite messageFromCartel(){

        List<Word> words = new ArrayList<>();

        // "You are dead Cabron"
        words.add(new Word(Arrays.asList(new Letter('Y'), new Letter('o'), new Letter('u'))));
        words.add(new Word(Arrays.asList(new Letter('a'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('e'), new Letter('a'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('C'), new Letter('a'), new Letter('b'), new Letter('r'), new Letter('o'), new Letter('n'))));

        return new Sentence(words);
    }
}
