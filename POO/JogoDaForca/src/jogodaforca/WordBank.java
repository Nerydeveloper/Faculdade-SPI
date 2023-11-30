package jogodaforca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author adrian Classe WordBank: Responsável por armazenar e selecionar
 * palavras para o jogo.
 */
class WordBank {
    private List<String> words;

    public WordBank() {
        words = new ArrayList<>();
        // Adicione palavras ao banco de palavras
        words.add("java");
        words.add("programacao");
        words.add("classe");
        // Adicione mais palavras conforme necessário
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }
}