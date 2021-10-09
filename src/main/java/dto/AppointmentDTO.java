package dto;

import java.util.Date;

import model.Appointments;

public class AppointmentDTO {

	private Long id;
    private String name;
    private Date startDate;
    private Date endDate;  
    private Long adminId;
    private Long patientId;
    private String cancelationReason;
    private Date cancelationDate;
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
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getCancelationReason() {
		return cancelationReason;
	}
	public void setCancelationReason(String cancelationReason) {
		this.cancelationReason = cancelationReason;
	}
	public Date getCancelationDate() {
		return cancelationDate;
	}
	public void setCancelationDate(Date cancelationDate) {
		this.cancelationDate = cancelationDate;
	}
    
	
    
}
