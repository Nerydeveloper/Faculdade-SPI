package javaapplication49;

/**
 *
 * @author adria
 */
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordBank {
    private List<String> palavras;

    public WordBank() {
        // Inicializa o banco de palavras
        palavras = new ArrayList<>();
        adicionarPalavra("PROGRAMACAO");
        adicionarPalavra("JAVA");
        adicionarPalavra("DESENVOLVIMENTO");
        adicionarPalavra("INTERFACE");
        adicionarPalavra("ESCOLA");
        adicionarPalavra("COMPUTADOR");
        adicionarPalavra("ALGORITMO");
        adicionarPalavra("SWING");
        adicionarPalavra("LINGUAGEM");
        adicionarPalavra("ADRIAN");
    }

    private void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public String obterPalavraAleatoria(NivelDificuldade nivel) {
        List<String> palavrasDoNivel = new ArrayList<>();

        for (String palavra : palavras) {
            if (palavra.length() <= nivel.getTamanhoMaximoPalavra()) {
                palavrasDoNivel.add(palavra);
            }
        }

        if (palavrasDoNivel.isEmpty()) {
            // Se não houver palavras no nível desejado, escolha uma aleatória do banco inteiro
            return palavras.get(new Random().nextInt(palavras.size()));
        } else {
            // Escolhe uma palavra aleatória do nível desejado
            return palavrasDoNivel.get(new Random().nextInt(palavrasDoNivel.size()));
        }
    }
}

