package aula07;

public class Lutador {
  //Atributos
  private String nome;
  private String nacionalidade;
  private int idade;
  private int altura;
  private int peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;
  
  //Construtor
  public Lutador(String nome, String nacionalidade, int idade, int altura, int peso, String categoria, int vitorias, int derrotas, int empates) {
      this.nome = nome;
      this.nacionalidade = nacionalidade;
      this.idade = idade;
      this.altura = altura;
      this.peso = peso;
      this.categoria = categoria;
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

  private int getAltura() {
      return altura;
  }

  private void setAltura(int altura) {
      this.altura = altura;
  }

  private int getPeso() {
      return peso;
  }

  private void setPeso(int peso) {
      this.peso = peso;
  }

  private String getCategoria() {
      return categoria;
  }

  private void setCategoria(String categoria) {
      this.categoria = categoria;
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
  public void apresentar() {}
  public void status() {}
  public void ganharLuta() {}
  public void perderLuta() {}
  public void empatarLuta() {}


}
