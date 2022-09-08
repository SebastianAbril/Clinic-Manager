package com.sebastianabril.clinicmanager.clinicmanagerapi.repository;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentTypeRepository extends JpaRepository<DocumentType, Long> {
}
