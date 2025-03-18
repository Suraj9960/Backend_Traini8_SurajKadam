package com.traini8_backend.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traini8_backend.entity.TrainingCenter;
import com.traini8_backend.repository.TrainingCenterRepository;
import com.traini8_backend.service.TrainingCenterService;

@Service
public class TrainingCenterServiceImplementation implements TrainingCenterService {
	
	@Autowired
	private TrainingCenterRepository repository;

	@Override
	public List<TrainingCenter> getAllTrainingCenters() {
		
		return repository.findAll();
	}

	@Override
	public TrainingCenter addTrainingCenter(TrainingCenter ts) {
		return repository.save(ts);
	}

	@Override
	public List<TrainingCenter> find(String query) {
		
		return repository.searchTrainingCenters(query);
	}

}
