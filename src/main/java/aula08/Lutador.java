package aula08;

public class Lutador {
  //Atributos
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  //Construtor
  public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
      this.nome = nome;
      this.nacionalidade = nacionalidade;
      this.idade = idade;
      this.altura = altura;
      this.setPeso(peso);
      this.vitorias = vitorias;
      this.derrotas = derrotas;
      this.empates = empates;
  }

  //Métodos especiais
  private String getNome() {
      return nome;
  }

  private void setNome(String nome) {
      this.nome = nome;
  }

  private String getNacionalidade() {
      return nacionalidade;
  }

  private void setNacionalidade(String nacionalidade) {
      this.nacionalidade = nacionalidade;
  }

  private int getIdade() {
      return idade;
  }

  private void setIdade(int idade) {
      this.idade = idade;
  }

  private float getAltura() {
      return altura;
  }

  private void setAltura(int altura) {
      this.altura = altura;
  }

  private float getPeso() {
      return peso;
    }
    
    private void setPeso(float peso) {
      this.peso = peso;
      setCategoria();
  }

  private String getCategoria() {
      return categoria;
  }
  private void setCategoria() {
    if(this.peso < 52.2) {
        this.categoria = "Inválido";
      } else if (this.peso <= 70.3) {
        this.categoria = "Leve";
      } else if (this.peso <= 83.9) {
        this.categoria = "Médio";
      } else if (this.peso <= 120.2) {
        this.categoria = "Pesado";
      } else {
        this.categoria = "Inválido";
      }
  }


  private int getVitorias() {
      return vitorias;
  }

  private void setVitorias(int vitorias) {
      this.vitorias = vitorias;
  }

  private int getDerrotas() {
      return derrotas;
  }

  private void setDerrotas(int derrotas) {
      this.derrotas = derrotas;
  }

  private int getEmpates() {
      return empates;
  }

  private void setEmpates(int empates) {
      this.empates = empates;
  }

  //Métodos abstratos
  public void apresentar() {
    System.out.println("---------------------------------");
    System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
   System.out.println("Diretamente de " + this.getNacionalidade());
   System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura.");
    System.out.println("Pesando " + this.getPeso() + " Kg.");
    System.out.println("Classificado como " + this.getCategoria());
    System.out.println(this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empate(s).");
    System.out.println("---------------------------------");
  }
  public void status() {
    System.out.println(getNome() +" é um peso " + getCategoria());
    System.out.println("Ganhou " + getVitorias() + " vezes, perdeu " + getDerrotas() + " vezes e empatou " + getEmpates() + " vezes.");
  }
  public void ganharLuta() {
    setVitorias(getVitorias() + 1);

  }
  public void perderLuta() {
    setDerrotas(getDerrotas() + 1);
  }
  public void empatarLuta() {
    setEmpates(getEmpates() + 1);
  }


}
