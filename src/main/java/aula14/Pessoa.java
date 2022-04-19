package aula14;

public abstract class Pessoa {
    //atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    //Constructor
    public Pessoa(String nome, int idade, String sexo) {
      this.nome = nome;
      this.idade = idade;
      this.sexo = sexo;
      this.experiencia = 0;
    }
       
    //metodos
    protected float ganharExp() {
      return this.experiencia ++; 
    }
    
    //getters e setter
    
    public String getNome() {
      return nome;
    }
    
    public void setNome(String nome) {
      this.nome = nome;
    }
    
    public int getIdade() {
      return idade;
    }
    
    public void setIdade(int idade) {
      this.idade = idade;
    }
    
    public String getSexo() {
      return sexo;
    }
    
    public void setSexo(String sexo) {
      this.sexo = sexo;
    }
    
    public float getExp() {
      return experiencia;
    }
    
    public void setExp(float exp) {
      this.experiencia = exp;
    }
    @Override
    public String toString() {
      return "Pessoa\n==============================\n"+"\nNome = "+nome+"\nIdade = "+idade+
      "\nSexo = "+sexo+"\nExperiencia = "+experiencia+"\n==============================";
    }
}
