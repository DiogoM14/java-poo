package main.java.aula03;

public class Caneta {
  public String modelo;
  public String cor;
  private float bico;
  protected int carga;
  private boolean tapada;

  public void status() {
    System.out.println("Modelo " + this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Bico " + this.bico);
    System.out.println("Carga " + this.carga);
    System.out.println("Está tapada? " + this.tapada);
  }

  public void rabiscar() { // void -> Sem retorno
    if (this.tapada) {
      System.out.println("Erro! Não posso rabiscar");
    } else {
      System.out.println("Estou a rabiscar");
    }
  }

  public void tapar() { 
    this.tapada = true; // this -> Objeto c1
  }

  public void destapar() {
    this.tapada = false;
  }
  
}
