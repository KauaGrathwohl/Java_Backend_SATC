package org.exercicios.terceiraEntrega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.exercicios.terceiraEntrega.dto.IndicacaoAtorDto;
import org.exercicios.terceiraEntrega.service.OscarService;

@RestController
public class IndicacaoController {

    private final OscarService oscarService;

    @Autowired
    public IndicacaoController(OscarService oscarService) {
        this.oscarService = oscarService;
    }

    @PostMapping("/indicacao/ator")
    public void adicionarIndicacaoAtor(@RequestBody IndicacaoAtorDto indicacaoAtorDto) {
        oscarService.adicionarIndicacaoAtor(indicacaoAtorDto);
    }
}
