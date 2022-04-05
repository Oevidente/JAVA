package projetolivro;

public class ProjetoLivro {
  public static void main(String[] args) {
    //instanciando objetos
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];
    //inicilizando objetos
    p[0] = new Pessoa("André", 25, "M");
    p[1] = new Pessoa("Bela", 20, "F");

    l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
    l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
    l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

    //imprimindo detalhes dos livros
    l[0].abrir();
    l[0].folhear(200);
    l[0].avancarPag();
    System.out.println(l[0].detalhes());
  }
}
