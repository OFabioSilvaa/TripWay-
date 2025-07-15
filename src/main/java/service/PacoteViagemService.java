package com.tripway.tripway.service;
import com.tripway.tripway.model.PacoteViagem;
import com.tripway.tripway.repository.PacoteViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacoteViagemService {

    private final PacoteViagemRepository pacoteViagemRepository;

    @Autowired
    public PacoteViagemService(PacoteViagemRepository pacoteViagemRepository) {
        this.pacoteViagemRepository = pacoteViagemRepository;
    }

    // Método para listar todos os pacotes de viagem
    public List<PacoteViagem> findAll() {
        return pacoteViagemRepository.findAll();
    }

    // Método para buscar um pacote de viagem pelo ID
    public Optional<PacoteViagem> findById(Long id) {
        return pacoteViagemRepository.findById(id);
    }

    // Método para salvar (criar ou atualizar) um pacote de viagem
    public PacoteViagem save(PacoteViagem pacoteViagem) {
        return pacoteViagemRepository.save(pacoteViagem);
    }

    // Método para deletar um pacote de viagem pelo ID
    public void deleteById(Long id) {
        pacoteViagemRepository.deleteById(id);
    }
}