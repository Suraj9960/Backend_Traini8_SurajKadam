package com.traini8_backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.traini8_backend.entity.TrainingCenter;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Integer> {
	
	@Query("SELECT p FROM TrainingCenter p WHERE " +
		       "LOWER(p.CenterName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
		       "LOWER(p.CenterCode) LIKE LOWER(CONCAT('%', :query, '%'))")
	public List<TrainingCenter> searchTrainingCenters(@Param("query") String query);

}
