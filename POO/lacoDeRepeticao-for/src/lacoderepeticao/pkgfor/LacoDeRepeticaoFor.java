package lacoderepeticao.pkgfor;

/**
 *
 * @author adrian nery
 */
public class LacoDeRepeticaoFor {

    
    public static void main(String[] args) {
        
        /*
         * A estrutura de repetição for é iniciada com for (int i = 0; i < 10; i++). Vamos dividir isso em três partes:
         * int i = 0: Isso inicializa a variável i com o valor 0. Este é o ponto de partida do loop.
         * i < 10: Esta é a condição de continuação do loop. Enquanto i for menor que 10, o loop continuará a ser executado.
         * i++: Isso é chamado de expressão de iteração. A cada iteração do loop, i é incrementado em 1.
         */
        for (int i = 0; i < 10; i++) {
            //Dentro do bloco de código do loop, 
            //ele imprime a mensagem "Número: " seguida pelo valor atual de i. 
            //Isso é feito usando System.out.println("Número: " + i);.
            System.out.println("Número: " + i);
        }
        /*
            O loop será executado 10 vezes, começando com i igual a 0 e terminando quando i for igual a 9.
            Portanto, ele imprimirá "Número: 0" até "Número: 9" no console.
        */
    }
    
}
