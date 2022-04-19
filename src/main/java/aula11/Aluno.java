package aula11;

public class Aluno extends Pessoa{
 protected int matr;
 protected String curso;

 public void pagarMensalidade() {
   System.out.println("Pagando mensalidade do aluno " + this.nome);
 }

 public void cancelarMatr() {
   System.out.println("Matrícula cancelada");
 }

 public int getMatr() {
      return matr;
  }
 public void setMatr(int matr) {
      this.matr = matr;
  }
 public String getCurso() {
      return curso;
  }
 public void setCurso(String curso) {
      this.curso = curso;
  }

}
