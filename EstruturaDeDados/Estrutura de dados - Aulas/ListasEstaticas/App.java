public class App {
    public static void main(String[] args) throws Exception {

/***********************************
1. escrever uma lista de 20 posições, e trocar o primeiro elemento pelo último, o segundo pelo penúltimo, ....

2. escrever uma lista que receba duas listas A e B, de tamanho 10 e fazer a multiplicação dos elementos de mesmo indice,
retornando uma lista C
***********************************/

// 1.

    Lista L1 = new Lista(20);

    for(int i=1; i<=20; i++){
        L1.adiciona(i);
    }    
    System.out.println("\n=== Lista L1 ====");
    L1.imprimir();

    for(int i=1; i<=20; i++){
        L1[i] = L1[i+19];        
        L1[i+19] = L1[i];
    }    
    System.out.println("\n=== Lista trocada ===");
    L1.imprimir();

// 2.

    Lista LA = new Lista(10);

    for(int i=1; i<=10; i++){
        LA.adiciona(i);
    }
    System.out.println("\n=== Lista LA ====");
    LA.imprimir();    

    
    Lista LB = new Lista(10);

    for(int i=1; i<=10; i++){
        LB.adiciona(i);
    }
    System.out.println("\n=== Lista LB ====");
    LB.imprimir();    

    Lista LC = new Lista(10);

    for(int i=1; i<=10; i++){
        int res = A[i] * B[i];  
        LC.adiciona(res);
    }

    System.out.println("\n=== Lista LC -> multiplicação dos índices <- ====");
    LC.imprimir();
       
    
    }//fim void
}//fim App