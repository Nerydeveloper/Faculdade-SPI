package jogodavelha;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author adrian 
 * Classe WordBank: Responsável por armazenar e selecionar
 * palavras para o jogo.
 */
public class WordBank {

    ArrayList<String> palavras = new ArrayList<>();
    
    // CONSTRUTOR PARA ARMAZERAR AS PALAVRAS
    public WordBank(){ 
        palavras.add("artificial");  
        palavras.add("conhecida");
        palavras.add("hortifrúti");
        palavras.add("fachada");
        palavras.add("prelevar");
        palavras.add("reativação");
        palavras.add("biela");
        palavras.add("engordurado");
        palavras.add("promotor");
        palavras.add("intercambiável");

    }

    public String getPalavra(int index) {
        return palavras.get(index);
    }

    public ArrayList<String> getPalavras() {
        return palavras;
    }

    public void setPalavras(ArrayList<String> palavras) {
        this.palavras = palavras;
    }
    
    // METODO PARA SORTEAR UMA PALAVRA
    public String sorteaPalavra(){
         // Cria uma instância da classe Random
        Random random = new Random();

        // Gera um número aleatório de 0 a 9
        int numeroSorteado = random.nextInt(10);
        
        return this.palavras.get(numeroSorteado);
    }

    
}
