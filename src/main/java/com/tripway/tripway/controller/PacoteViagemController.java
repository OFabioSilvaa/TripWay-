package com.tripway.tripway.controller;

import com.tripway.tripway.model.PacoteViagem;
import com.tripway.tripway.service.PacoteViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacotes")
public class PacoteViagemController {

    private final PacoteViagemService pacoteViagemService;

    @Autowired
    public PacoteViagemController(PacoteViagemService pacoteViagemService) {
        this.pacoteViagemService = pacoteViagemService;
    }

    @GetMapping
    public List<PacoteViagem> getAllPacotesViagem() {
        return pacoteViagemService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacoteViagem> getPacoteViagemById(@PathVariable Long id) {
        return pacoteViagemService.findById(id)
                .map(pacote -> ResponseEntity.ok(pacote))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PacoteViagem> createPacoteViagem(@RequestBody PacoteViagem pacoteViagem) {
        PacoteViagem savedPacote = pacoteViagemService.save(pacoteViagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPacote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacoteViagem> updatePacoteViagem(@PathVariable Long id, @RequestBody PacoteViagem pacoteViagem) {
        return pacoteViagemService.findById(id)
                .map(pacoteExistente -> {
                    // Atualiza os dados do pacote existente
                    pacoteExistente.setNomePacote(pacoteViagem.getNomePacote());
                    pacoteExistente.setDescricao(pacoteViagem.getDescricao());
                    pacoteExistente.setPrecoTotal(pacoteViagem.getPrecoTotal());
                    pacoteExistente.setDataPartida(pacoteViagem.getDataPartida());
                    pacoteExistente.setDataRetorno(pacoteViagem.getDataRetorno());
                    pacoteExistente.setIdDestinoPrincipal(pacoteViagem.getIdDestinoPrincipal());
                    pacoteExistente.setStatusPacote(pacoteViagem.getStatusPacote());
                    PacoteViagem updatedPacote = pacoteViagemService.save(pacoteExistente);
                    return ResponseEntity.ok(updatedPacote);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePacoteViagem(@PathVariable Long id) {
        if (pacoteViagemService.findById(id).isPresent()) {
            pacoteViagemService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}