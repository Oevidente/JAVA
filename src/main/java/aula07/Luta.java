package aula07;
public class Luta {
  //Atributos
  private String desafiado;
  private String desafiante;
  private int rounds;
  private boolean aprovada;

  //Construtor
  public Luta(String desafiado, String desafiante, int rounds, boolean aprovada) {
    this.desafiado = desafiado;
    this.desafiante = desafiante;
    this.rounds = rounds;
    this.aprovada = aprovada;
  }

  //Métodos
  public void marcarLuta() {}
  public void lutar() {}
  
}
