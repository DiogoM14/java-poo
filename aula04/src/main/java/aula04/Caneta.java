package aula04;

public class Caneta {
  private String modelo;
  private String cor;
  private float bico;
  private boolean tapada;

  public Caneta(String m, String c, float b) {
    this.modelo = m;
    this.cor = c;
    this.setBico(b);  // Opcional
    this.tapar();
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String c) {
    this.cor = c;
  }

  public float getBico() {
    return this.bico;
  }

  public void setBico(float p) {
    this.bico = p;
  }

  public void tapar() {
    this.tapada = true;
  }

  public void destapar() {
    this.tapada = false;
  }

  public void status() {
    System.out.println("Sobre a caneta: ");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ponta: " + this.getBico());
    System.out.println("Cor: " + this.cor);
    System.out.println("Tapada: " + this.tapada);
  }
}
