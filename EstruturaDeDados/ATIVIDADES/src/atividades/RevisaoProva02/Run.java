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
        
        
        
        System.out.println("Fila 02: "+ f2.tamanho());
        System.out.println("Fila 03: "+ f3.tamanho());
        
        f4.questao01(f1, f2, f3);
        System.out.println("Fila 02: "+ f2.tamanho());
        System.out.println("Fila 03: "+ f3.tamanho());
        
        
        
        
        
        
        FilaEncadeada f1s = new FilaEncadeada();
        FilaEncadeada f2s = new FilaEncadeada();
        FilaEncadeada f3s = new FilaEncadeada();

        
        


        f1s.enqueue(20);
        f1s.enqueue(30);
        f1s.enqueue(40);
        f1s.enqueue(50);

        f2s.enqueue(203);
        f2s.enqueue(303);
        f2s.enqueue(403);
        f2s.enqueue(503);
        
        
        f3s.questao02(f1s, f2s);
        System.out.println("Fila 3:" + f3s);



        
    }
    
}
