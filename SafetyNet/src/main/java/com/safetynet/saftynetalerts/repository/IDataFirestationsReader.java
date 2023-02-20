package com.safetynet.saftynetalerts.repository;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.safetynet.saftynetalerts.model.Firestation;
import com.safetynet.saftynetalerts.model.Person;

public interface IDataFirestationsReader {

	List<Firestation> readFirestations() throws IOException;

}
