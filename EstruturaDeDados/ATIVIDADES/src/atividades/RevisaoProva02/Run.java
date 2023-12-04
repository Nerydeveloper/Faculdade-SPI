package atividades.RevisaoProva02;

/**
 *
 * @author adrian
 */
public class Run {
    public static void main(String[] args) {
        Fila f1 = new Fila();
        Fila f2 = new Fila();
        Fila f3 = new Fila();
        Fila f4 = new Fila();
        
        
        f1.enfileirar(20);
        f1.enfileirar(10);
        f1.enfileirar(2);
        f1.enfileirar(3);
        
        f2.enfileirar(10);
        f2.enfileirar(11);
        f2.enfileirar(12);
        f2.enfileirar(31);
        
        f3.enfileirar(123);
        f3.enfileirar(211);
        f3.enfileirar(453);
        f3.enfileirar(15);
        
        System.out.println("Fila 02: "+ f2.tamanho());
        System.out.println("Fila 03: "+ f3.tamanho());
        
        f4.questao01(f1, f2, f3);
        System.out.println("Fila 02: "+ f2.tamanho());
        System.out.println("Fila 03: "+ f3.tamanho());

       


        
    }
    
}
