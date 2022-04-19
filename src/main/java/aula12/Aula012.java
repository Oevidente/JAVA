package aula12;

public class Aula012 {
  public static void main(String[] args) {
    Mamifero m = new Mamifero();
    Cachorro Dalila = new Cachorro();
    Canguru Bob = new Canguru();
    Cobra Konka = new Cobra();
    Tartaruga Vinny = new Tartaruga();
    Goldfish Scooby = new Goldfish();
    Arara Eslo = new Arara();
   
    m.setPeso(5.7f);
    m.setIdade(8);
    m.setMembros(4);
    m.locomover();
    m.alimentar();
    m.emitirSom();
    System.out.println("--------------------------------\n");
    System.out.println("Bob é um Canguru");
    Bob.setPeso(55.30f);
    Bob.setIdade(3);
    Bob.setMembros(4);
    Bob.locomover();
    Bob.alimentar();
    Bob.emitirSom();
    Bob.usarBolsa();
    System.out.println("--------------------------------\n");
    System.out.println("Dalila é um Cachorro");
    Dalila.setPeso(6.0f);
    Dalila.setIdade(11);
    Dalila.setMembros(4);
    Dalila.locomover();
    Dalila.alimentar();
    Dalila.emitirSom();
    Dalila.abanarRabo();
    System.out.println("--------------------------------\n");
    System.out.println("Konka é uma Cobra");
    Konka.setPeso(1.0f);
    Konka.setIdade(1);
    Konka.setMembros(0);
    Konka.locomover();
    Konka.alimentar();
    Konka.emitirSom();
    System.out.println("--------------------------------\n");
    System.out.println("Vinny é uma Tartaruga");
    Vinny.setPeso(0.5f);
    Vinny.setIdade(1);
    Vinny.setMembros(0);
    Vinny.locomover();
    Vinny.alimentar();
    Vinny.emitirSom();
    System.out.println("--------------------------------\n");
    System.out.println("Scooby é um Goldfish");
    Scooby.setPeso(0.3f);
    Scooby.setIdade(1);
    Scooby.setMembros(0);
    Scooby.locomover();
    Scooby.alimentar();
    Scooby.emitirSom();
    Scooby.soltarBolha();
    System.out.println("--------------------------------\n");
    System.out.println("Eslo é um Arara");
    Eslo.setPeso(0.3f);
    Eslo.setIdade(1);
    Eslo.setMembros(0);
    Eslo.locomover();
    Eslo.alimentar();
    Eslo.emitirSom();
    Eslo.fazerNinho();
    System.out.println("--------------------------------\n");
  }
  
}
