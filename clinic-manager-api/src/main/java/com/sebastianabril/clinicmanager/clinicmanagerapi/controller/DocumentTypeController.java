package com.sebastianabril.clinicmanager.clinicmanagerapi.controller;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.DocumentType;
import com.sebastianabril.clinicmanager.clinicmanagerapi.service.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentTypeController {

    @Autowired
    private DocumentTypeService documentTypeService;

    @GetMapping("/document-type")
    public List<DocumentType> getDocumentsType(){
        return documentTypeService.getDocumentsType();
    }

}
