package com.brief.TDD.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.brief.TDD.entity.Clients;
import com.brief.TDD.entity.Sexe;
import com.brief.TDD.entity.SexeEnum;

@SpringBootTest
class Client_servicesTest {

	@Test
	void testGet_all_Clients() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd_one_client() {

		Sexe sexeClient = new Sexe();
		sexeClient.setSexe(SexeEnum.Male);
		Clients client = new Clients();
		client.setEmail("john.doe@example.com");
		client.setName("Doe");
		client.setFirst_name("John");
		client.setNumber_cellphone(1234567890);
//		client.setBirthday(new Date(2023,08,08));
		client.setBirthday(new Date());
		client.setSexe(sexeClient);
	}

	@Test
	void testFind_client_by_id() {
		fail("Not yet implemented");
	}

	@Test
	void testFind_client_by_email() {
		fail("Not yet implemented");
	}

	@Test
	void testGet_client_by_sex() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete_client_by_id() {
		fail("Not yet implemented");
	}

	@Test
	void testDisabled_client() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate_client() {
		fail("Not yet implemented");
	}

}
