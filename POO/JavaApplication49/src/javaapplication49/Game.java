package javaapplication49;

/**
 *
 * @author adria
 */
import java.util.Random;

import javax.swing.*;

public class Game {
    private String palavraAtual;
    private int tentativasRestantes;
    private int pontuacao;
    private WordBank wordBank;
    private DicaProvider dicaProvider;

    public Game(WordBank wordBank, DicaProvider dicaProvider) {
        this.wordBank = wordBank;
        this.dicaProvider = dicaProvider;
    }

    public void iniciarJogo(NivelDificuldade nivel) {
        palavraAtual = wordBank.obterPalavraAleatoria(nivel);
        tentativasRestantes = nivel.getNumTentativas();
        pontuacao = 0;

        if (nivel == NivelDificuldade.FACIL) {
            // Adicionar lógica para fornecer dicas em níveis mais fáceis
            String dica = dicaProvider.obterDica(palavraAtual);
            System.out.println("Dica: " + dica);
        }
    }

    String getPalavraAtual() {
        return palavraAtual;
    }

    String getTentativasRestantes() {
        return Integer.toString(tentativasRestantes);
    }

    String getPontuacao() {
        return Integer.toString(pontuacao);
    }

    boolean verificarFimDeJogo() {
        return tentativasRestantes <= 0 || !palavraAtual.contains("_");
    }

    String getStatusAtual() {
        if (verificarFimDeJogo()) {
            if (tentativasRestantes <= 0) {
                return "Você perdeu! A palavra era: " + palavraAtual;
            } else {
                return "Parabéns! Você ganhou!";
            }
        } else {
            return "Continue tentando...";
        }
    }

    void tentativa(String palavraTentativa) {
        if (palavraAtual.equals(palavraTentativa.toUpperCase())) {
            // O usuário acertou a palavra inteira
            pontuacao += calcularPontuacaoDificuldade(palavraAtual);
        } else {
            // O usuário errou a palavra
            tentativasRestantes--;
        }

        // Atualizar a palavra oculta com a nova tentativa
        palavraAtual = atualizarPalavraOculta(palavraAtual);

        // Atualizar a interface gráfica com base no estado atual do jogo
        palavraLabel.setText("Palavra: " + palavraAtual);
        statusLabel.setText("Status: " + getStatusAtual());
        tentativasLabel.setText("Tentativas restantes: " + tentativasRestantes);
        pontuacaoLabel.setText("Pontuação: " + pontuacao);

        // Verificar se o jogo terminou
        if (verificarFimDeJogo()) {
            JOptionPane.showMessageDialog(null, "Fim de jogo! " + getStatusAtual());
            iniciarNovoJogo(); // Inicia um novo jogo após o término
        }
    }

    private String atualizarPalavraOculta(String palavraOculta) {
        StringBuilder novaPalavra = new StringBuilder(palavraOculta.length());

        for (int i = 0; i < palavraOculta.length(); i++) {
            novaPalavra.append(palavraOculta.charAt(i) == ' ' ? ' ' : '_');
        }

        return novaPalavra.toString();
    }

    private int calcularPontuacaoDificuldade(String palavra) {
        // Lógica para calcular a pontuação com base na dificuldade da palavra
        // Por exemplo, mais pontos para palavras mais difíceis
        return palavra.length() * 10; // Ajuste conforme necessário
    }

    private void iniciarNovoJogo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
