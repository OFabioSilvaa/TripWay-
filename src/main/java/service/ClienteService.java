package com.tripway.tripway.service;

import com.tripway.tripway.model.Cliente;
import com.tripway.tripway.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Método para listar todos os clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Método para buscar um cliente pelo ID
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    // Método para salvar (criar ou atualizar) um cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Método para deletar um cliente pelo ID
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}