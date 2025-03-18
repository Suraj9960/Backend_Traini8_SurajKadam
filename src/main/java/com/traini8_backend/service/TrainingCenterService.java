package com.traini8_backend.service;

import java.util.List;

import com.traini8_backend.entity.TrainingCenter;

public interface TrainingCenterService {
	
	public List<TrainingCenter> getAllTrainingCenters();
	
	public TrainingCenter addTrainingCenter(TrainingCenter ts);
	
	public List<TrainingCenter> find(String query);
}
