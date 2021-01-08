package aula05;

import aula05.entities.ContaBanco;

public class App {
    public static void main( String[] args ) {
        ContaBanco cb1 = new ContaBanco(123, "cp", "Diogo Martins", 14200, true);
        
        System.out.println(cb1.toString());
    }
}
