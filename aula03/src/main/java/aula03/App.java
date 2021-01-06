package aula03;

import main.java.aula03.Caneta;

public class App 
{
    public static void main( String[] args ) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        // c1.bico = 0.5f;
        // c1.carga = 80;
        c1.tapar();
        // c1.destapar();
        c1.status(); 
    }
}
