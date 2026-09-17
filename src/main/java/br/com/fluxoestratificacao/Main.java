package br.com.fluxoestratificacao;

import br.com.fluxoestratificacao.model.ComplexidadeCaso;
import br.com.fluxoestratificacao.model.OrdemEstratificacao;
import br.com.fluxoestratificacao.service.PlanejadorProducao;
import br.com.fluxoestratificacao.strategy.EstrategiaPrazoComplexo;
import br.com.fluxoestratificacao.strategy.EstrategiaPrazoIntermediario;
import br.com.fluxoestratificacao.strategy.EstrategiaPrazoSimples;
import java.time.LocalDate;

/**
 * Demonstração didática do padrão Strategy com prazos fictícios.
 */
public class Main {

    public static void main(String[] args) {
        LocalDate dataEntrada = LocalDate.of(2026, 9, 17);

        OrdemEstratificacao ordemSimples = new OrdemEstratificacao(
                "ORD-001", ComplexidadeCaso.SIMPLES, dataEntrada);
        PlanejadorProducao planejador = new PlanejadorProducao(new EstrategiaPrazoSimples());
        planejador.planejar(ordemSimples);
        System.out.println("Código: " + ordemSimples.getCodigo()
                + " | Complexidade: " + ordemSimples.getComplexidade()
                + " | Previsão: " + ordemSimples.getPrevisaoConclusao());

        OrdemEstratificacao ordemIntermediaria = new OrdemEstratificacao(
                "ORD-002", ComplexidadeCaso.INTERMEDIARIO, dataEntrada);
        planejador.definirEstrategia(new EstrategiaPrazoIntermediario());
        planejador.planejar(ordemIntermediaria);
        System.out.println("Código: " + ordemIntermediaria.getCodigo()
                + " | Complexidade: " + ordemIntermediaria.getComplexidade()
                + " | Previsao: " + ordemIntermediaria.getPrevisaoConclusao());

        OrdemEstratificacao ordemComplexa = new OrdemEstratificacao(
                "ORD-003", ComplexidadeCaso.COMPLEXO, dataEntrada);
        planejador.definirEstrategia(new EstrategiaPrazoComplexo());
        planejador.planejar(ordemComplexa);
        System.out.println("Código: " + ordemComplexa.getCodigo()
                + " | Complexidade: " + ordemComplexa.getComplexidade()
                + " | Previsao: " + ordemComplexa.getPrevisaoConclusao());
    }
}
