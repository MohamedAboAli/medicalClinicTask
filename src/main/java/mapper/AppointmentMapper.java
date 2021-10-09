package mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import dto.AppointmentDTO;
import model.Admin;
import model.Appointments;
import model.Patient;
import repository.AdminRep;
import repository.AppointmentRep;
import repository.PatientRep;


@Component
public class AppointmentMapper {
	
	@Autowired
	private AdminRep adminRep;
	
	@Autowired
	private PatientRep patientRep;
	
	
	public  AppointmentDTO toDto(Appointments appointment) {
		AppointmentDTO dto=new AppointmentDTO();
		if(appointment != null) {
			dto.setId(appointment.getId());
    		dto.setName(appointment.getName());
    		dto.setStartDate(appointment.getStartDate());
    		dto.setEndDate(appointment.getEndDate());
    		dto.setAdminId(appointment.getAdmin().getAdminId());
    		dto.setPatientId(appointment.getPatient().getPatientId());
    		dto.setCancelationCheck(appointment.getCancelationCheck());
    	}
		return dto;
	}
	
	public  Appointments toEntity(AppointmentDTO dto) {
		Appointments appointment=new Appointments();
			Admin admin=adminRep.findByAdminId(dto.getAdminId());
			appointment.setAdmin(admin);
			Patient patient=patientRep.findByPatientId(dto.getPatientId());
			appointment.setPatient(patient);
			appointment.setStartDate(dto.getStartDate());
			appointment.setEndDate(dto.getEndDate());
			appointment.setName(dto.getName());	
			appointment.setCancelationCheck(1);	
		return appointment;
		}

	public AdminRep getAdminRep() {
		return adminRep;
	}

	public void setAdminRep(AdminRep adminRep) {
		this.adminRep = adminRep;
	}

	public PatientRep getPatientRep() {
		return patientRep;
	}

	public void setPatientRep(PatientRep patientRep) {
		this.patientRep = patientRep;
	}

	

}
