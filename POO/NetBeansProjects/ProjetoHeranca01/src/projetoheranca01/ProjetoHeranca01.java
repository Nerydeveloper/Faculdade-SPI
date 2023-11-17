package projetoheranca01;

public class ProjetoHeranca01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.idade = 10;
        a.peso = 15;
        
        System.out.println("Dados do Animal");
        System.out.println("Idade: " + a.idade);
        System.out.println("Peso: " + a.peso);
        
        Mamifero m = new Mamifero();
        m.idade = 19;
        m.peso = 45;
        
        System.out.println("Dados do Mamífero");
        System.out.println("Idade: " + m.idade);
        System.out.println("Peso: " + m.peso);
        m.mamar();
        
        Humano h = new Humano();
        h.idade = 1;
        h.peso = 9;
        
        System.out.println("Dados do Humano");
        System.out.println("Idade: " + h.idade);
        System.out.println("Peso: " + h.peso);
        h.mamar();
        h.apresentar();
    }    
}
