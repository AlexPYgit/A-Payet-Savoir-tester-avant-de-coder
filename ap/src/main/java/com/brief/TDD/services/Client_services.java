package com.brief.TDD.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brief.TDD.entity.Clients;
import com.brief.TDD.repository.ClientRepository;

@Service
public class Client_services {

	@Autowired
	public Client_services (ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	//This is the list of clients get in DB
		private List<Clients> clients = new ArrayList<>();
		
		//Get all clients in DB 
		public List<Clients> get_all_Clients() {
			return clientRepository.findAll(); 
		}
		
		// add one client in the DB
		
		//find one client with ID
		
		//find one client with email
		
		//find all client by sex-type
		
		//delete one client
		
		//turn off a client
		
		//update one client
}
