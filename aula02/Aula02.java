public class Aula02 {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "Bic Crystal";
    c1.cor = "Azul";
    c1.ponta = 0.5f; //f no final representa float
    c1.carga = 80;
    c1.tampada = true;
    
    c1.tampar();
    c1.status();
    c1.rabiscar();
  }
}
