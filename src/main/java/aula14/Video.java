package aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Constructor
    
    public Video(String tit){
      this.titulo = tit;
      this.avaliacao = 1;
      this.views = 0;
      this.curtidas = 0;
      this.reproduzindo = false;
    }
    
    //setters e getters
    
    public void setTitulo(String tit) {
      this.titulo = tit;
    }
    
    public String getTitulo() {
      return this.titulo;
    }
    public void setAvaliacao(int av) {
      int nova;
      nova = (this.avaliacao + av) / this.views;
      this.avaliacao = nova;
    }
    
    public int getAvaliacao() {
      return this.avaliacao;
    }
    
    public void setViews(int vw) {
      this.views = vw;
    }
    
    public int getViews() {
      return this.views;
    }
    public void setCurtidas(int like) {
      this.curtidas = like;
    }
    
    public int getCurtidas() {
      return this.curtidas;
    }
    public void setReproduzindo(boolean rep) {
      this.reproduzindo = rep;
    }
    
    public boolean getReproduzindo() {
      return this.reproduzindo;
    }
    
    //metodos
    
    @Override
    public void play() {
        this.reproduzindo = true; 
    }
    
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    
    @Override
    public void like() {
      this.setCurtidas(this.getCurtidas()+1);
    }
    
    @Override
    public String toString() {
      return "Video{"+"\nTìtulo = "+titulo+"\nAvaliação = "+avaliacao+
      "\nViews = "+views+"\nCurtidas = "+curtidas+"\nReproduzindo = "+reproduzindo+"}";
    }
}
