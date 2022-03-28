package aula04;

public class Caneta {
  public String modelo;
  private float ponta;
  private boolean tampada;
  private String cor;

  public Caneta(String modelo, float ponta, boolean tampada, String cor) {
      this.modelo = modelo;
      this.ponta = ponta;
      this.tampada = tampada;
      this.cor = cor;
  }

public void status() {
 if (this.tampada == true) {
   System.out.println("Esta é uma caneta " + this.modelo + " de ponta " + this.ponta + " e de cor " + this.cor + " e está tampada");
 } else {
   System.out.println("Esta é uma caneta " + this.modelo + " de ponta " + this.ponta + " e de cor " + this.cor + " e está destampada");
 }
} 

}
