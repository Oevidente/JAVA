package projetolivro;

import javax.swing.text.ParagraphView;

public class Pessoa {
  //Atributos

  private String nome;
  private int idade;
  private String sexo;

  //construtor
  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  //métodos abstratos
  public void fazerAniversario() {
    this.idade++;
  }

  //métodos especiais

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return this.nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getSexo() {
    return this.sexo;
  }

}
