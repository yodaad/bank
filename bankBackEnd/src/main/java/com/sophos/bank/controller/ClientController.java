package com.sophos.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.bank.entity.Client;
import com.sophos.bank.service.ClientService;


@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Client>> getClients() {
		return new ResponseEntity<>(clientService.getAllClients(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable("id") int id) {
		return clientService.getClientById(id)
				.map(client -> new ResponseEntity<>(client, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping
	public ResponseEntity<Client> createClient(@RequestBody Client client) {
		return new ResponseEntity<>(clientService.createClient(client), HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Client> updateClient(@RequestBody Client client) {
		return new ResponseEntity<>(clientService.createClient(client), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Client> deleteClientById(@PathVariable("id)") int id) {
		if (clientService.deleteClientById(id)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
