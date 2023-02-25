package com.safetynet.saftynetalerts.service;

import java.util.List;

import com.safetynet.saftynetalerts.model.MedicalRecord;

public interface IMedicalRecordService {

	public List<MedicalRecord> getAllMedicalRecords();
	
	public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);
	
	public MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord);

	public void deleteMedicalRecord(String firstName, String lastName);

	boolean isPersonAdult(String firstName, String lastName);

	MedicalRecord getMedicalRecordByFirstNameAndLastName(String firstName, String lastName);

	List<MedicalRecord> getMedicalRecordsByFirstNameAndLastName(String firstName, String lastName);

}
