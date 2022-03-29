package exercicio01;

import exercicio01.Calculadora;


public class Ex01 {

  public static void main(String[] args) {
   Calculadora c1 = new Calculadora();
   c1.Calculadora("hp", "cinza", true);
   c1.somar(1, 2);
   c1.subtrair(10, 8);
   c1.multiplicar(5, 6);
   c1.dividir(30, 5);
   c1.restoDeDivisao(5, 4);
  }
}
