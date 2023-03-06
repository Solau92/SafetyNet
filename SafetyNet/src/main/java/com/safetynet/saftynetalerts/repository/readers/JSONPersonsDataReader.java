package com.safetynet.saftynetalerts.repository.readers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.safetynet.saftynetalerts.model.Person;

public class JSONPersonsDataReader implements IDataPersonsReader {

	String filePath;

	public JSONPersonsDataReader(String filePath) {
		this.filePath = filePath;
	}
	

	@Override
	public List<Person> readPersons() throws IOException {
		
		File file = new File(filePath);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode personsNode = objectMapper.readTree(file).get("persons");

		ObjectMapper objectMapper2 = new ObjectMapper();
		
		return objectMapper2.readValue(personsNode.toString(), new TypeReference<List<Person>>() {});
	}

}
