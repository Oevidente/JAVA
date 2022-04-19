package aula13;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    public abstract void emitirSom();
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso() {
      return this.peso;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
      return this.idade;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public int getMembros() {
      return this.membros;
    }
}
