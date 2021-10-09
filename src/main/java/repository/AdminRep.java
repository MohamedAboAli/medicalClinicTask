package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Admin;

@Repository
public interface AdminRep extends JpaRepository<Admin, Long>{

	public Admin findByAdminId(Long adminId);
}
