package org.exercicios.Entrega_03.controller;

import org.exercicios.Entrega_03.dto.IndicacaoAtorDto;
import org.exercicios.Entrega_03.dto.IndicacaoFilmeDto;
import org.exercicios.Entrega_03.service.OscarService;
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
