package com.mycompany.listasencadeadas;

/**
 *
 * @author Adrian Nery
 * Me siga no github https://github.com/Nerydeveloper
 */
public class testes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ListasEncadeada lista = new ListasEncadeada();
        lista.adicionaNoInicio(10);
        lista.adiciona(1, "k");
        lista.adicionaNoFinal("A");
        lista.adiciona(0, 10);
        System.out.println(lista.toString());
        System.out.println("O valor da posição 1 é: " + lista.pega(1));
        lista.removeDoinicio();
        System.out.println("Lista apos a remoção do inicio: " + lista.toString());
        lista.removeDoFinal();
        System.out.println("Lista apos a remoção do final: " + lista.toString());

    }
}
