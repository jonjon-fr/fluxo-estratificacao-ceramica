package br.com.fluxoestratificacao.strategy;

import br.com.fluxoestratificacao.model.OrdemEstratificacao;
import java.time.LocalDate;

/**
 * Regra fictícia para casos intermediários.
 */
public class EstrategiaPrazoIntermediario implements EstrategiaPrazo {

    @Override
    public LocalDate calcularPrevisao(OrdemEstratificacao ordem) {
        return ordem.getDataEntrada().plusDays(5);
    }
}
