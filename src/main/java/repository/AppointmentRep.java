package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Appointments;

@Repository
public interface AppointmentRep  extends JpaRepository<Appointments, Long>{
	  
	public List<Appointments> findByCancelationCheck(int cancelationCheck);
	
	public List<Appointments> findByPatient_Name(String patientName);
	
	@Query(value = "from Appointments t where startDate >= :startDate AND endDate <= :endDate")
	public List<Appointments> getAllBetweenDates(@Param("startDate")Date startDate,@Param("endDate")Date endDate);
	
	public List<Appointments> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(Date endDate, Date startDate);	
	}
