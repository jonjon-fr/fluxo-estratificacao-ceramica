package br.com.fluxoestratificacao.service;

import br.com.fluxoestratificacao.model.OrdemEstratificacao;
import br.com.fluxoestratificacao.strategy.EstrategiaPrazo;

/**
 * Contexto do padrão Strategy: aplica a regra de prazo escolhida a uma ordem.
 */
public class PlanejadorProducao {
    private EstrategiaPrazo estrategiaPrazo;
public PlanejadorProducao(EstrategiaPrazo estrategiaPrazo) {
    this.estrategiaPrazo = estrategiaPrazo;
    }
public void definirEstrategia(EstrategiaPrazo estrategiaPrazo) {
    this.estrategiaPrazo = estrategiaPrazo;
    }    
public void planejar(OrdemEstratificacao ordem) {
    ordem.setPrevisaoConclusao(estrategiaPrazo.calcularPrevisao(ordem));
    }
}