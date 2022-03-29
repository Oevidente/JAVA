package aula06;

public class ControleRemoto implements Controlador {
  //Atributos
  private int volume;
  private boolean ligado;
  private boolean tocando;

  //Métodos Especiais
  public void ControleRemoto() {
    this.volume = 50;
    this.ligado = true;
    this.tocando = false;
  }
  
  private int getVolume() {
      return volume;
  }

  private void setVolume(int volume) {
      this.volume = volume;
  }

  private boolean getLigado() {
      return ligado;
  }

  private void setLigado(boolean ligado) {
      this.ligado = ligado;
  }

  private boolean getTocando() {
      return tocando;
  }

  private void setTocando(boolean tocando) {
      this.tocando = tocando;
  }

  //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
      if (this.getLigado() == true) {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("-----------------");
      } else {
        System.out.println("Impossível abrir o menu, o aparelho está desligado!");
      }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
       if (this.getLigado()) {
         this.setVolume(this.getVolume() + 5);
       } else {
         System.out.println("Não posso aumentar o volume");
       }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
          setVolume(this.getVolume() - 5);
        } else {
          System.out.println("Não posso diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
      if (this.getLigado() && this.getVolume() > 0) {
          this.setVolume(0);
      } else {
          System.out.println("Não posso ligar o mudo");
      }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
          this.setVolume(50);
        } else {
          System.out.println("Não posso desligar o mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
          this.setTocando(true);
        } else {
          System.out.println("Não posso tocar");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
          this.setTocando(false);
        } else {
          System.out.println("Não posso pausar");
        }
    }
  
}
