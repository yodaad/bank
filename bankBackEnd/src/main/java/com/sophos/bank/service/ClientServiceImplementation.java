package com.sophos.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophos.bank.entity.Client;
import com.sophos.bank.repository.ClientRepository;

@Service
public class ClientServiceImplementation implements ClientService{
	
	@Autowired
	ClientRepository clientRepository;

	public Client createClient(Client client) {
		
		return clientRepository.save(client);
	}

	public List<Client> getAllClients() {
		
		return clientRepository.findAll();
	}

	public Optional<Client> getClientById(int id) {
		
		return clientRepository.findById(id);
	}

	public Client updateClient(Client client) {
		
		return clientRepository.save(client);
	}

	public boolean deleteClientById(int id) {
		// Método pendiente a el entity productos
		return false;
	}

}
