package br.com.fluxoestratificacao.strategy;

import br.com.fluxoestratificacao.model.OrdemEstratificacao;
import java.time.LocalDate;

/**
 * Contrato comum para as regras fictícias de cálculo de prazo.
 */
public interface EstrategiaPrazo {
    LocalDate calcularPrevisao(OrdemEstratificacao ordem); 
}
