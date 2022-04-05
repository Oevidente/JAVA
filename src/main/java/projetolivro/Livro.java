package projetolivro;

public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totPaginas;
  private boolean aberto;
  private Pessoa leitor;
  private int pagAtual;

  //Construtor

  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas = totPaginas;
    this.leitor = leitor;
    this.aberto = false;
    this.pagAtual = 0;
  }

  //abstratos


  public String detalhes() {
    return "Livro{" +
      "\nTitulo = '" + titulo + "'\nAutor = '" + autor + "'\nTotal de páginas = " + totPaginas +
      "\nPágina atual = " + pagAtual +
      "\nAberto = " + aberto +
      "\nLeitor = " + leitor.getNome() +"\nIdade = " + leitor.getIdade() + " anos" +
      "\nSexo = " + leitor.getSexo() +
      "\n}";
  }

  //setters e getters

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public int getTotPaginas() {
    return this.totPaginas;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public boolean getAberto() {
    return this.aberto;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  public Pessoa getLeitor() {
    return this.leitor;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public int getPagAtual() {
    return this.pagAtual;
  }


  @Override
  public void abrir() {
    this.aberto = true;
  }

  @Override
  public void fechar() {
    this.aberto = false;
  }

  @Override
  public void folhear(int p) {
    if (p > this.totPaginas) {
      this.setPagAtual(this.getTotPaginas());
    } else {
      this.setPagAtual(p);
    }
  }

  @Override
  public void avancarPag() {
    if(getPagAtual() >= getTotPaginas()) {
      setPagAtual(0);
    } else {
      this.pagAtual++;
    }
  }

  @Override
  public void voltarPag() {
    this.pagAtual--;
  }
}
