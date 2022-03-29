package exercicio01;

public class Calculadora {
  public String marca;
  public String cor;
  protected boolean status;
  
  public void setMarca(m){
    this.marca = m;
  }
  public String getMarca(){
    return this.marca;
  }
  public void setCor(c){
    this.cor = c;
  }
  public String getCor(){
    return this.cor;
  }
  public void setStatus(s){
    this.status = s;
  }
  public boolean getStatus(){
    return this.status;
  }
  
  public void ligar() {
    this.setStatus(true);
  }
  public void desligar() {
    this.setStatus(false);
  }
  public void somar(num1, num2) {
    if(this.getStatus() == true) {
      double resultado = num1 + num2;
      System.out.println("O resultado da soma é: " + resultado);
    }
    else {
      System.out.println("ERRO! Calculadora desligada");
    }
  }
  public void subtrair(){}
  public void dividir(){}
  public void multiplicar(){}
  public void restoDeDivisao(){}
}
