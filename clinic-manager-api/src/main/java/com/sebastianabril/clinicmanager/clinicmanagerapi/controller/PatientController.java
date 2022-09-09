package com.sebastianabril.clinicmanager.clinicmanagerapi.controller;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.Patient;
import com.sebastianabril.clinicmanager.clinicmanagerapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patient")
    public List<Patient> get(){
        return patientService.getPatients();
    }

    /* RequestBody el JSON que voy a enviar desde POSTMAN me lo convierta en objeto Patient */
    @PostMapping("/patient")
    public void create(@RequestBody Patient patient){
        String name = patient.getName();
        String lastName = patient.getLastName();
        String document = patient.getDocument();
        Long documentTypeId = patient.getDocumentTypeId();

        patientService.createPatient(name,lastName,document,documentTypeId);
    }

    @DeleteMapping("/patient/{id}")
    public String delete(@PathVariable("id") Long id){
        String message = patientService.deletePatient(id);
        return message;
    }


}
