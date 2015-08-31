package calculadoradep2;

public class Operacoes {

    Double subtracao;
    Double soma;
    Double multiplicacao;
    Double divisao;

    public Double getDivisao() {
        return divisao;
    }

    public void setDivisao(Double divisao) {
        this.divisao = divisao;
    }
   
    
    public Double getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(Double subtracao) {
        this.subtracao = subtracao;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

    public Double getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(Double multiplicacao) {
        this.multiplicacao = multiplicacao;
    }
    
    
    Double Operasoma (Double a, Double b){
    soma = a + b;
    return soma;
    }
    
    Double operasub (Double c, Double d){
    subtracao = c - d ;
    return subtracao;
    }
    
    Double operamult (Double e, Double f){
    multiplicacao = e * f;
    return multiplicacao;     
    }
    
    Double operadiv (Double g, Double h){
    divisao = g / h ;
    return divisao;
    
    }
    
    
    
    
    
}
