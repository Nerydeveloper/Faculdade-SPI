package polimorfismo01;

public class Polimorfismo01 {

    public static void main(String[] args) {
        FormaGeometrica formas[] = {
            new Circulo(), 
            new Triangulo(), 
            new Retangulo(),
            new Poligonal()
        };
        
        for(FormaGeometrica fg : formas){
            fg.desenhar();
        }
    }
    
}
