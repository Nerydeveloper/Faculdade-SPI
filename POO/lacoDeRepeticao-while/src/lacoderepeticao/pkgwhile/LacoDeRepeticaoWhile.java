package lacoderepeticao.pkgwhile;

/**
 *
 * @author adrian nery
 */
public class LacoDeRepeticaoWhile {

    public static void main(String[] args) {
        
        //Declarando uma variável num e a inicializa com o valor 1.
        int num = 1;
        
        //Em seguida, inicia um loop "while" com a condição num <= 10. 
        //Enquanto essa condição for verdadeira, o loop continuará a ser executado.
        while (num <= 10) {            
            /*
            Dentro do bloco do loop, ele imprime a mensagem "Número: " 
            seguida pelo valor atual de num usando System.out.println("Número: " + num);.
            */
            System.out.println("Número: " + num);
            
            /*
            Após a impressão, a variável num é incrementada em 1 usando num++. 
            Isso significa que a cada iteração do loop, o valor de num aumenta em 1.
            */
            num++;
        }
        /*
        O loop continua a ser executado até que a condição num <= 10 seja falsa. 
        Portanto, ele imprimirá "Número: 1" até "Número: 10", já que a variável num aumenta em cada iteração.
        */
    }
    
}
