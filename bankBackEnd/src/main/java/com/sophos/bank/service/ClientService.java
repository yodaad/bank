package com.sophos.bank.service;

import java.util.List;
import java.util.Optional;

import com.sophos.bank.entity.Client;

public interface ClientService {
	
	public Client createClient(Client client);
	public List<Client> getAllClients();
	public Optional<Client> getClientById(int id);
	public Client updateClient(Client client);
	public boolean deleteClientById(int id);

}
