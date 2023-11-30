package javaapplication33;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author adrian
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordBank {
    private List<String> words;

    public WordBank() {
        words = new ArrayList<>();
        initializeWords();
    }

    private void initializeWords() {
        // Adicione suas palavras aqui
        words.add("java");
        words.add("python");
        words.add("javascript");
        words.add("html");
        words.add("css");
        words.add("php");
    }

    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
