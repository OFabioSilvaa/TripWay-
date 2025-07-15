package com.tripway.tripway.controller;
import com.tripway.tripway.model.Destino;
import com.tripway.tripway.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    private final DestinoService destinoService;

    @Autowired
    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping
    public List<Destino> getAllDestinos() {
        return destinoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destino> getDestinoById(@PathVariable Long id) {
        return destinoService.findById(id)
                .map(destino -> ResponseEntity.ok(destino))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Destino> createDestino(@RequestBody Destino destino) {
        Destino savedDestino = destinoService.save(destino);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDestino);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Destino> updateDestino(@PathVariable Long id, @RequestBody Destino destino) {
        return destinoService.findById(id)
                .map(destinoExistente -> {
                    destinoExistente.setNomeCidade(destino.getNomeCidade());
                    destinoExistente.setNomePais(destino.getNomePais());
                    destinoExistente.setDescricao(destino.getDescricao());
                    Destino updatedDestino = destinoService.save(destinoExistente);
                    return ResponseEntity.ok(updatedDestino);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDestino(@PathVariable Long id) {
        if (destinoService.findById(id).isPresent()) {
            destinoService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}