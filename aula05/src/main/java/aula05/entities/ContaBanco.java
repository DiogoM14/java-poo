package aula05.entities;

public class ContaBanco {
  private int numConta;
  private String tipoConta;
  private String donoConta;
  private float saldoConta;
  private Boolean status;

  // public ContaBanco() {}

  public ContaBanco(int numConta, String tipoConta, String donoConta, float saldoConta, Boolean status) {
    this.numConta = numConta;
    this.tipoConta = tipoConta;
    this.donoConta = donoConta;
    this.saldoConta = saldoConta;
    this.status = status;
  }

  public int getNumConta() {
    return this.numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getTipoConta() {
    return this.tipoConta;
  }

  public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
  }

  public String getDonoConta() {
    return this.donoConta;
  }

  public void setDonoConta(String donoConta) {
    this.donoConta = donoConta;
  }

  public float getSaldoConta() {
    return this.saldoConta;
  }

  public void setSaldoConta(float saldoConta) {
    this.saldoConta = saldoConta;
  }

  public Boolean isStatus() {
    return this.status;
  }

  public Boolean getStatus() {
    return this.status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "{" +
      " numConta='" + getNumConta() + "'" +
      ", tipoConta='" + getTipoConta() + "'" +
      ", donoConta='" + getDonoConta() + "'" +
      ", saldoConta='" + getSaldoConta() + "'" +
      ", status='" + isStatus() + "'" +
      "}";
  }

}
