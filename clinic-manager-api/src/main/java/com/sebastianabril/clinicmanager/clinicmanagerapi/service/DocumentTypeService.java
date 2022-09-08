package com.sebastianabril.clinicmanager.clinicmanagerapi.service;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.DocumentType;
import com.sebastianabril.clinicmanager.clinicmanagerapi.repository.DocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService {

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    public List<DocumentType> getDocumentsType(){
        return documentTypeRepository.findAll();
    }

    public Optional<DocumentType> getDocumentTypeById(Long id){
        return documentTypeRepository.findById(id);
    }
}
