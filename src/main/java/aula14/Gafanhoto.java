package aula14;

public class Gafanhoto extends Pessoa {
    //atribuicao
    private String login;
    private int totAssistido;
    
    //constructor
    
    public Gafanhoto(String nome, int idade, String sexo, String login) {
      super(nome, idade, sexo);
      this.login = login;
      this.totAssistido = 0;
    }
    
    //metodos
    public int viuMaisUm() {
      return this.totAssistido ++; 
    }
    
    //getters e setters
    
    public String getLogin() {
      return login;
    }
    public void setLogin(String login) {
      this.login = login;
    }
    public int getTot() {
      return totAssistido;
    }
    public void setTot(int tot) {
      this.totAssistido = tot;
    }
    @Override
    public String toString() {
      return "Gafanhoto\n==============================\n"+super.toString()+"\nLogin = "+login+"\nTotal assistido = "+totAssistido+"\n==============================";
    }
}
