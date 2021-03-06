package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "patient")
	private Set<Appointments> appointments;

	

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Appointments> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointments> appointments) {
		this.appointments = appointments;
	}
	
	
}
