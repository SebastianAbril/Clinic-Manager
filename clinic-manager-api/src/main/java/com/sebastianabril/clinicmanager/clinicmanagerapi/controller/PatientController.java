package com.sebastianabril.clinicmanager.clinicmanagerapi.controller;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.Patient;
import com.sebastianabril.clinicmanager.clinicmanagerapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PreUpdate;
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
    public void create(@RequestBody PatientRequest request){
        String name = request.name;
        String lastName = request.lastName;
        String document = request.document;
        Long documentTypeId = request.documentTypeId;

        patientService.createPatient(name,lastName,document,documentTypeId);
    }

    @DeleteMapping("/patient/{id}")
    public String delete(@PathVariable("id") Long id){
        String message = patientService.deletePatient(id);
        return message;
    }



    @PutMapping("/patient/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody PatientRequest patientRequest ){

        String name = patientRequest.name;
        String lastName = patientRequest.lastName;
        String document = patientRequest.document;
        Long documentTypeId = patientRequest.documentTypeId;

        patientService.updatePatient(id, name, lastName, document, documentTypeId);


    }


}
