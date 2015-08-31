
package cinemadep2;


public class Filme {
    
    String nome;
    Integer duracao;
    Integer classificacao;
    String genero;
    String atores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }
    
    
    
    
    public String resumo(){
    
        return "Filme " + "\nNome : " + this.nome + "\nDuração :" + duracao + " mim " + "\nClassificação : " + classificacao + " \nGênero : " + genero + " \n " + "Atores :" + atores  ;
    
    }
    Boolean vericlassificacao(Integer idade){
    
        if(idade >= classificacao){
        return true;
        }
        else{
        return false;
        }
    }
    
    String tipofilme(){
    if(duracao <=60)
      return "curtametragem"  ;
    else{
    return "longametragem";
    
    }
        
    }
    
    
}
