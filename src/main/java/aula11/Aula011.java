package aula11;

public class Aula011 {
  public static void main(String[] args) {
    Visitante v1 = new Visitante();
    v1.setNome("Juvenal");
    v1.setIdade(22);
    v1.setSexo("M");
    System.out.println(v1.toString());

    Aluno a1 = new Aluno();
    a1.setNome("Cláudio");
    a1.setMatr(1111);
    a1.setCurso("Informática");
    a1.setIdade(16);
    a1.setSexo("M");
    a1.pagarMensalidade();

    Bolsista b1 = new Bolsista();
    b1.setMatr(1112);
    b1.setNome("Jubileu");
    b1.setBolsa(12.5f);
    b1.setSexo("M");
    b1.pagarMensalidade();

    Tecnico t1 = new Tecnico();
    t1.setMatr(1113);
    t1.setNome("José");
    t1.setRegistroProfissional(12345);
    t1.setCurso("Informática");
    t1.setIdade(18);
    t1.setSexo("M");
    t1.praticar();
  }
}
