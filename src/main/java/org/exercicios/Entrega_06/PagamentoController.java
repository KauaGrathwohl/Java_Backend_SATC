package org.exercicios.Entrega_06;

import org.exercicios.Entrega_06.dto.TransferenciaDto;
import org.exercicios.Entrega_06.dto.UsuarioDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pagamento")
public class PagamentoController {

    @PostMapping("usuario")
    public ResponseEntity createUsuario(@RequestBody UsuarioDto usuarioDto) {
        if (usuarioDto.getCpf().equals(new UsuarioDto().getCpf())) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }

        return ResponseEntity.ok("Usuário criado com sucesso");
    }

    @GetMapping("usuario/{id}")
    public ResponseEntity getUsuario(@PathVariable("id") Long id) {
        UsuarioDto usuarioExistente = new UsuarioDto();
        usuarioExistente.setId(1L);
        if (id != usuarioExistente.getId()) {
            return new ResponseEntity("Usuário não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(usuarioExistente);
    }

    @PutMapping("usuario/{id}")
    public ResponseEntity updateUsuario(@RequestBody UsuarioDto usuarioDto,
                                        @PathVariable("id") Long id) {
        UsuarioDto usuarioExistente = new UsuarioDto();
        usuarioExistente.setId(1L);
        if (id != usuarioExistente.getId()) {
            return new ResponseEntity("Usuário não encontrado", HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok("Usuário atualizado com sucesso");
    }

    @DeleteMapping("usuario/{id}")
    public ResponseEntity deleteUsuario(@PathVariable("id") Long id) {
        UsuarioDto usuarioExistente = new UsuarioDto();
        usuarioExistente.setId(1L);
        if (id != usuarioExistente.getId()) {
            return new ResponseEntity("Usuário não encontrado", HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok("Usuário excluído com sucesso");
    }

    @PostMapping("transferencia")
    public ResponseEntity createTransferencia(@RequestBody TransferenciaDto transferenciaDto) {
        boolean transferenciaConflituosa = transferenciaDto.getValor().compareTo(new TransferenciaDto().getValor()) == 0 &&
                transferenciaDto.getDataTransferencia().isEqual(new TransferenciaDto().getDataTransferencia()) &&
                transferenciaDto.getContaDestino().equals(new TransferenciaDto().getContaDestino());
        if (transferenciaConflituosa) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }

        return ResponseEntity.ok("Tranferência realizada com sucesso");
    }

    @GetMapping("transferencia")
    public ResponseEntity getTransferencias() {
        List<TransferenciaDto> transferencias = new ArrayList<>();
        transferencias.add(new TransferenciaDto());
        return ResponseEntity.ok(transferencias);
    }
}