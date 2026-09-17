package br.com.fluxoestratificacao.strategy;

import br.com.fluxoestratificacao.model.OrdemEstratificacao;
import java.time.LocalDate;

/**
 * Regra fictícia: casos simples recebem três dias corridos.
 */
public class EstrategiaPrazoSimples implements EstrategiaPrazo {

    @Override
    public LocalDate calcularPrevisao(OrdemEstratificacao ordem) {
        return ordem.getDataEntrada().plusDays(3);
    }
}
