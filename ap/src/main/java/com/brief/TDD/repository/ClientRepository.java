package com.brief.TDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brief.TDD.entity.Clients;

@Repository
public interface ClientRepository extends JpaRepository<Clients, int > {
	   // No additional methods needed for this example

}
