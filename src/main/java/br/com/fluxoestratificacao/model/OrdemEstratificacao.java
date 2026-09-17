package br.com.fluxoestratificacao.model;

import java.time.LocalDate;

/**
 * Representa uma ordem fictícia usada no estudo do padrão Strategy.
 * Não armazena dados de pacientes nem informações clínicas.
 */
public class OrdemEstratificacao {

    private String codigo;
    private ComplexidadeCaso complexidade;
    private LocalDate dataEntrada;
    private LocalDate previsaoConclusao;
    
    public OrdemEstratificacao(
       String  codigo,
       ComplexidadeCaso  complexidade,
       LocalDate  dataEntrada) {
     this.codigo = codigo;
     this.complexidade = complexidade;
     this.dataEntrada = dataEntrada;     
    }
    public String getCodigo() {
        return codigo;
     }   
     public void setPrevisaoConclusao(LocalDate previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
     } 
     public LocalDate getDataEntrada() {
         return dataEntrada;
     }   
     public ComplexidadeCaso getComplexidade() {
         return complexidade;
     }
     public LocalDate getPrevisaoConclusao() {
         return previsaoConclusao; 
     }    
}