package breaking_bad_simulation.composite;

import breaking_bad_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GusMessage {

    public LetterComposite messageFromGus(){

        List<Word> words = new ArrayList<>();

        // "We will end your bussines!"
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'), new Letter('l'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('e'), new Letter('n'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('y'), new Letter('o'), new Letter('u'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('b'), new Letter('u'), new Letter('s'), new Letter('s'), new Letter('i'), new Letter('n'), new Letter('e'), new Letter('s'))));

        return new Sentence(words);
    }
}
