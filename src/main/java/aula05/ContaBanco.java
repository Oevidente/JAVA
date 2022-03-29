package aula05;

public class ContaBanco {
  //Atributos
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;
  
  public ContaBanco() {
    this.setSaldo(0);
    this.setStatus(false);
  }

  //Métodos Personalizados
  public void abrirConta(String tipo) {
    this.setTipo(tipo);
    this.setStatus(true);
    if (tipo == "cc") {
      this.setSaldo(50);
    } else if (tipo == "cp") {
      this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso!");
  }
  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("ERRO! Conta com dinheiro");
    } else if (this.getSaldo() < 0) {
      System.out.println("ERRO! Conta em débito");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso!");
    }
  }
  public void depositar(float valor) {
    if (this.getStatus() == true) {
      this.setSaldo(this.getSaldo() + valor);
      System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
    } else {
      System.out.println("ERRO! Impossível depositar");
    }
  }
  public void sacar(float valor) {
    if(getStatus() == true) {
      if(getSaldo() >= valor) {
        setSaldo(getSaldo()-valor);
        System.out.println("Saque realizado com sucesso!");
      }
      else {
      System.out.println("ERRO! Não foi possível realizar o saque! Saldo insuficiente.");
      }
    } else {
      System.out.println("ERRO! Impossível sacar");
    }
  }
  public void pagarMensal() {
    /*cc conta corrente
    cp conta poupança */
    float valor;
    if (getTipo() == "cc") {
      valor = 12;
    } else if (getTipo() == "cp") {
      valor = 20;
    }
    if (getStatus() == true) {
      if (getSaldo() >= valor) {
        setSaldo(getSaldo() - valor);
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("Impossível pagar");
    }
  }

  //Métodos Especiais
  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }
  public int getNumConta() {
    return numConta;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getTipo() {
    return tipo;
  }
  public void setDono(String dono) {
    this.dono = dono;
  }
  public String getDono() {
    return dono;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public float getSaldo() {
    return saldo;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }
  public boolean getStatus() {
    return status;
  }
  public void status() {
      System.out.println("Conta: " + this.numConta);
      System.out.println("Tipo: " + this.tipo);
      System.out.println("Dono: " + this.dono);
      System.out.println("Saldo: " + this.saldo);
      System.out.println("Status: " + this.status);
  }

}
