package aula02;

public class App 
{
    public static void main( String[] args ) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.bico = 0.5f;
        c1.destapar();
        c1.status(); 
        c1.rabiscar();
    }
}
