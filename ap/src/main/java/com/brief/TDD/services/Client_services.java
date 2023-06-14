package com.brief.TDD.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brief.TDD.entity.Clients;
import com.brief.TDD.repository.ClientRepository;

import jakarta.persistence.PersistenceContext;

@Service
public class Client_services {

		@Autowired
		private ClientRepository clientRepo;
		
		//This is the list of clients get in DB
		private ArrayList<Clients> clients = new ArrayList<Clients>();
		
		//Get all clients in DB 
		public List<Clients> get_all_Clients() throws Exception {
			throw new Exception("not implemented");
		}
		
		// add one client in the DB
		public Clients add_one_client() throws Exception{
			throw new Exception("not implemented");
		}
		 
		//find one client with ID
		public Clients find_client_by_id() throws Exception{
			throw new Exception("not implemented");
		}
		
		//find one client with email
		public Clients find_client_by_email() throws Exception{
			throw new Exception("not implemented");
		}
		
		//find all client by sex-type
		public Clients get_client_by_sex() throws Exception{
			throw new Exception("not implemented");
		}
		
		//delete one client
		public Clients delete_client_by_id() throws Exception{
			throw new Exception("not implemented");
		}
		
		//turn off a client
		public Clients disabled_client() throws Exception{
			throw new Exception("not implemented");
		}
		
		//update one client
		public Clients update_client() throws Exception{
			throw new Exception("not implemented");
		}
}
