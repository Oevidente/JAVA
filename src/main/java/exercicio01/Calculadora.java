package exercicio01;

public class Calculadora {
  public String marca;
  public String cor;
  protected boolean status;
  
  public void setMarca(String m){
    this.marca = m;
  }
  public String getMarca(){
    return this.marca;
  }
  public void setCor(String c){
    this.cor = c;
  }
  public String getCor(){
    return this.cor;
  }
  public void setStatus(boolean s){
    this.status = s;
  }
  public boolean getStatus(){
    return this.status;
  }
  
  public void Calculadora(String m, String c, boolean s) {
    this.setMarca(m);
    this.setCor(c);
    this.setStatus(s);
  }
 
  public void ligar() {
    this.setStatus(true);
  }
  public void desligar() {
    this.setStatus(false);
  }
  public void somar(double num1, double num2) {
    if(this.getStatus() == true) {
      double resultado = num1 + num2;
      System.out.println("O resultado da soma de "+num1+" por "+num2+" é: " + resultado);
    }
    else {
      System.out.println("ERRO! Calculadora desligada");
    }
  }
  public void subtrair(double num1, double num2){
  if(this.getStatus() == true) {
      double resultado = num1 - num2;
      System.out.println("O resultado da subtração de "+num1+" por "+num2+" é: " + resultado);
    }
    else {
      System.out.println("ERRO! Calculadora desligada");
    }
  }
  public void dividir(double num1, double num2){
    if(this.getStatus() == true) {
      double resultado = num1 / num2;
      System.out.println("O resultado da divisão de "+num1+" por "+num2+" é: " + resultado);
    }
    else {
      System.out.println("ERRO! Calculadora desligada");
    }
  }
  public void multiplicar(double num1, double num2){
   if(this.getStatus() == true) {
      double resultado = num1 * num2;
      System.out.println("O resultado da multiplicação de "+num1+" por "+num2+" é: " + resultado);
    }
    else {
      System.out.println("ERRO! Calculadora desligada");
    } 
  }
  public void restoDeDivisao(double num1, double num2){
    if(this.getStatus() == true) {
      double resultado = num1 % num2;
      System.out.println("O resto da divisão de "+num1+" por "+num2+" é: " + resultado);
    }
    else {
      System.out.println("ERRO! Calculadora desligada");
    }
  }
}
