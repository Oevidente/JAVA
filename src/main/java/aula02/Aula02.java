package aula02;

public class Aula02 {
  public static void main(String[] args) {
    Caneta c1 = new Caneta(); 
    c1.tampar();
    c1.rabiscar();
    c1.setModelo("Bic Crystal");
    c1.setPonta(0.5f); //f no final representa float
    c1.setCor("Azul");
    c1.status();
  }
}
