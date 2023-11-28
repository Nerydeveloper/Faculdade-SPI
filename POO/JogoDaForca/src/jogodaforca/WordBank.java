package jogodaforca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adrian Classe WordBank: Responsável por armazenar e selecionar
 * palavras para o jogo.
 */
public class WordBank {

    public WordBank() {
        // Criar uma lista de dicionários
        List<Map<String, Object>> listaDeDicionarios = new ArrayList<>();

        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario1 = new HashMap<>();
        dicionario1.put("palavra", "Abacaxi");
        dicionario1.put("dica1", "Saboroso");
        dicionario1.put("dica2", "Tropical");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario1);
        
        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario2 = new HashMap<>();
        dicionario2.put("palavra", "Cachorro");
        dicionario2.put("dica1", "Leal");
        dicionario2.put("dica2", "Brincalhão");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario2);
        
        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario3 = new HashMap<>();
        dicionario3.put("palavra", "Maravilha");
        dicionario3.put("dica1", "Espetacular");
        dicionario3.put("dica2", "Surpreendente");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario3);

        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario4 = new HashMap<>();
        dicionario4.put("palavra", "Computador");
        dicionario4.put("dica1", "Tecnológico");
        dicionario4.put("dica2", "Multifuncional");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario4);
        
        
        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario5 = new HashMap<>();
        dicionario5.put("palavra", "Floresta");
        dicionario5.put("dica1", "Verdejante");
        dicionario5.put("dica2", "Habitada");
        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario5);
        
        
        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario6 = new HashMap<>();
        dicionario6.put("palavra", "Girassol");
        dicionario6.put("dica1", "Radiante");
        dicionario6.put("dica2", "Seguindo o Sol");
        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario6);

        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario7 = new HashMap<>();
        dicionario7.put("palavra", "Felicidade");
        dicionario7.put("dica1", "Contagiante");
        dicionario7.put("dica2", "Interna");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario7);

        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario8 = new HashMap<>();
        dicionario8.put("palavra", "Montanha");
        dicionario8.put("dica1", "Majestosa");
        dicionario8.put("dica2", "Imponente");

        
        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario8);
        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario9 = new HashMap<>();
        dicionario9.put("palavra", "Espetacular");
        dicionario9.put("dica1", "Impressionante");
        dicionario9.put("dica2", "Extraordinário");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario9);
        // Criar o primeiro dicionário
        //CADA DICIONARIO CONTEM INFORMAÇÕES SOBRE UMA PALAVRA
        Map<String, Object> dicionario10 = new HashMap<>();
        dicionario10.put("palavra", "Biblioteca");
        dicionario10.put("dica1", "Silenciosa");
        dicionario10.put("dica2", "Repleta de Conhecimento");

        // Adicionar o primeiro dicionário à lista
        listaDeDicionarios.add(dicionario10);

        // Imprimir a lista de dicionários
        for (Map<String, Object> dicionario : listaDeDicionarios) {
            System.out.println(dicionario);
        }

    }

}
