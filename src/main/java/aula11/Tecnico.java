package aula11;

public final class Tecnico extends Aluno{
  private int registroProfissional;

  public void praticar() {
    System.out.println(this.nome + " está praticando " + this.curso);
  } 
  
  public int getRegistroProfissional() {
      return registroProfissional;
  }
  public void setRegistroProfissional(int registroProfissional) {
      this.registroProfissional = registroProfissional;
  }

}
