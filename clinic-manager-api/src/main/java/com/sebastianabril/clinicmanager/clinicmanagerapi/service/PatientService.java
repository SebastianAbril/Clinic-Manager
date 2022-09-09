package com.sebastianabril.clinicmanager.clinicmanagerapi.service;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.DocumentType;
import com.sebastianabril.clinicmanager.clinicmanagerapi.model.Patient;
import com.sebastianabril.clinicmanager.clinicmanagerapi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {


    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DocumentTypeService documentTypeService;

    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }

    public void createPatient(String name, String lastName, String document, Long documentTypeId){

        Optional<DocumentType> documentType = documentTypeService.getDocumentTypeById(documentTypeId);

        if(documentType.isEmpty()){
            throw new RuntimeException("Invalid document type Id");
        }

        Patient patient = new Patient();
        patient.setName(name);
        patient.setLastName(lastName);
        patient.setDocument(document);
        patient.setDocumentTypeId(documentTypeId);

        patientRepository.save(patient);
    }

    public String deletePatient(Long id){
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if(optionalPatient.isPresent()){
            patientRepository.deleteById(id);
            return ("The patient with "+id+" has been deleted");
        } else {
            return ("Patient's Id did not found");
        }
    }
}
