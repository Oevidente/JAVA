package aula14;

import aula14.Gafanhoto;
import aula14.Video;
import aula14.Visualizacao;

public class Visualizacao {

    //Atributos

    private Gafanhoto espectador;
    private Video filme;
    
    //contructor
    public Visualizacao(Gafanhoto espectador, Video filme) {
      this.espectador = espectador;
      this.filme = filme;
      this.espectador.setTot(this.espectador.getTot()+1);
      this.filme.setViews(this.filme.getViews()+1);
    }
    
    //Metodos
    
    public void avaliar(){
      this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
      this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
      int tot = 0;
      if(porc <= 20) {
        tot = 3;
      } else if (porc <= 50) {
        tot = 5;
      } else if (porc <= 90) {
        tot = 8;
      } else {
        tot = 10;
      }
      this.filme.setAvaliacao(tot);
    }
    
    @Override
    public String toString() {
      return "Visualização{"+"espectador: "+espectador+"\nfilme: "+filme+"}";
    }
    
    //Getter e setter
    
    public Gafanhoto getEspec() {
      return espectador;
    }
    
    public void setEspec(Gafanhoto espectador) {
      this.espectador = espectador;
    }
    
    public Video getFilme() {
      return filme;
    }
    
    public void setFilme(Video filme) {
      this.filme = filme;
    }
}
