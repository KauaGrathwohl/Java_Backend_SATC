package org.exercicios.terceiraEntrega.controller;

import org.exercicios.terceiraEntrega.dto.IndicacaoAtorDto;
import org.exercicios.terceiraEntrega.dto.IndicacaoFilmeDto;
import org.exercicios.terceiraEntrega.service.OscarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oscar")
public class OscarController {

    private final OscarService oscarService;

    public OscarController(OscarService oscarService) {
        this.oscarService = oscarService;
    }

    @PostMapping("/adicionar-indicacao-ator")
    public ResponseEntity adicionarIndicacaoAtor(@RequestBody IndicacaoAtorDto indicacao) {
        oscarService.adicionarIndicacaoAtor(indicacao);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/adicionar-indicacao-filme")
    public ResponseEntity adicionarIndicacaoFilme(@RequestBody IndicacaoFilmeDto indicacao) {
        oscarService.adicionarIndicacaoFilme(indicacao);
        return ResponseEntity.ok().build();
    }
}
