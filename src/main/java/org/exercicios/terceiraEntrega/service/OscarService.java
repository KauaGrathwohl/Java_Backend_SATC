package org.exercicios.terceiraEntrega.service;

import org.springframework.stereotype.Service;
import org.exercicios.terceiraEntrega.dto.IndicacaoFilmeDto;
import org.exercicios.terceiraEntrega.dto.IndicacaoAtorDto;
import org.exercicios.terceiraEntrega.model.Indicacao;

import java.util.ArrayList;

@Service
public class OscarService {

    private ArrayList<Indicacao> indicacoes = new ArrayList<>();

    public void adicionarIndicacaoAtor(IndicacaoAtorDto indicacaoAtorDto) {
        validaElibilidadeIndicavel(indicacaoAtorDto.getElegibilidadeIndicavel());
        Indicacao indicacao = new Indicacao(indicacaoAtorDto.getIndicavel(), indicacaoAtorDto.getCategoria());
        this.indicacoes.add(indicacao);
    }

    public void adicionarIndicacaoFilme(IndicacaoFilmeDto indicacaoFilmeDto) {
        validaElibilidadeIndicavel(indicacaoFilmeDto.getElegibilidadeIndicavel());
        Indicacao indicacao = new Indicacao(indicacaoFilmeDto.getIndicavel(), indicacaoFilmeDto.getCategoria());
        this.indicacoes.add(indicacao);
    }

    private void validaElibilidadeIndicavel(boolean elegibilidadeIndicavel) {
        if (!elegibilidadeIndicavel) {
            throw new RuntimeException("O indicável não é elegível!");
        }
    }

    public ArrayList<Indicacao> mostrarListaIndicados() {
        return this.indicacoes;
    }
}
