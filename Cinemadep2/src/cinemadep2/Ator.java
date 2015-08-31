package cinemadep2;

public class Ator {

    String nome;
    Integer datanasci;
    Double cachePfilme;
    String nacionalidade;
    Boolean oscar;
    Integer totalfimes;
    Integer filmesNano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDatanasci() {
        return datanasci;
    }

    public void setDatanasci(Integer datanasci) {
        this.datanasci = datanasci;
    }

    public Double getCachePfilme() {
        return cachePfilme;
    }

    public void setCachePfilme(Double cachePfilme) {
        this.cachePfilme = cachePfilme;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Boolean getOscar() {
        return oscar;
    }

    public void setOscar(Boolean oscar) {
        this.oscar = oscar;
    }

    public Integer getTotalfimes() {
        return totalfimes;
    }

    public void setTotalfimes(Integer totalfimes) {
        this.totalfimes = totalfimes;
    }

    public Integer getFilmesNano() {
        return filmesNano;
    }

    public void setFilmesNano(Integer filmesNano) {
        this.filmesNano = filmesNano;
    }
    
    public String resumo(){
    
        return " Ator " +  "\nNome :" + this.nome + "\nData de nasci :" + this.datanasci + "\nCache Por Filme :" + this.cachePfilme + "\n" + this.nacionalidade + "\nTotal de filmes:" + this.totalfimes +"\nFilmes anuais:"+ this.filmesNano;
    
     }
    
    
    
    
}
