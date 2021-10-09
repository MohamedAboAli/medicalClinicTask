package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="appointments")
public class Appointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	

	@Column(name = "name")
	private String name;
	
	@Column(name = "startDate")
	private Date startDate;
	
	@Column(name = "endDate")
	private Date endDate;
	
	@Column(name = "cancelationReason")
	private String cancelationReason;
	
	@Column(name = "canceleationDate")
	private Date canceleationDate;
	
	@ManyToOne
    @JoinColumn(name="adminId")
	private Admin admin;
	
	@ManyToOne
    @JoinColumn(name="patientId")
	private Patient patient;
	
	
	// to check if AppointmentCanceled or not 0 = cancelled & 1 = not 
	@Column(name = "cancelationCheck")
	private int cancelationCheck;
	
	
	public int getCancelationCheck() {
		return cancelationCheck;
	}

	public void setCancelationCheck(int cancelationCheck) {
		this.cancelationCheck = cancelationCheck;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCancelationReason() {
		return cancelationReason;
	}

	public void setCancelationReason(String cancelationReason) {
		this.cancelationReason = cancelationReason;
	}

	public Date getCanceleationDate() {
		return canceleationDate;
	}

	public void setCanceleationDate(Date canceleationDate) {
		this.canceleationDate = canceleationDate;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

	
}
