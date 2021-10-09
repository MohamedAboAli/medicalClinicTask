package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Patient;

@Repository
public interface PatientRep extends JpaRepository<Patient, Long> {

	public Patient findByPatientId(Long patientId);
}
