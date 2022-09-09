package com.sebastianabril.clinicmanager.clinicmanagerapi.repository;

import com.sebastianabril.clinicmanager.clinicmanagerapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findByOrderByIdAsc();
}
