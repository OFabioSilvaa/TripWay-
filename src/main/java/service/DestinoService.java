package com.tripway.tripway.service;
import com.tripway.tripway.model.Destino;
import com.tripway.tripway.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinoService {

    private final DestinoRepository destinoRepository;

    @Autowired
    public DestinoService(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository; // Inicializa o repositório
    }

    // Método para listar todos os destinos
    public List<Destino> findAll() {
        return destinoRepository.findAll();
    }

    // Método para buscar um destino pelo ID
    public Optional<Destino> findById(Long id) {
        return destinoRepository.findById(id);
    }

    // Método para salvar (criar ou atualizar) um destino
    public Destino save(Destino destino) {
        return destinoRepository.save(destino);
    }

    // Método para deletar um destino pelo ID
    public void deleteById(Long id) {
        destinoRepository.deleteById(id);
    }
}