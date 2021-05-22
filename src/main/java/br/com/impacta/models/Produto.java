package br.com.impacta.models;

public class Produto {
    public int codigo ;
    public String descricao; 
    public Double valor;


    public String montarResumo(Produto prod){

        String resumo = prod.codigo + "  "+prod.descricao+"  "+ prod.valor ;
        return resumo;
    } 
		
    public String montarProduto(Produto prod){

        String resumo = "CODIGO: "+prod.codigo + " DESCRIÇÃO: "+prod.descricao+" VALOR: "+ prod.valor ;
        return resumo;
    } 

}
