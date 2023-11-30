package com.mycompany.listasencadeadas;

/**
 *
 * @author Adrian Nery
 * Me siga no github https://github.com/Nerydeveloper
 */

public class No {

    private No proximo;
    private Object elemento;

    public No(Object elemento, No proximo) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the proximo
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}
