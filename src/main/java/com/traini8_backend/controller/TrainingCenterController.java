package com.traini8_backend.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.traini8_backend.entity.TrainingCenter;
import com.traini8_backend.service_impl.TrainingCenterServiceImplementation;

import jakarta.validation.Valid;

@RestController
@RequestMapping("training-center/")
public class TrainingCenterController {
	
	@Autowired
	private TrainingCenterServiceImplementation service;

	/* This API is to get all the training center */
	
	@GetMapping("getAll")
	public List<TrainingCenter> getAlList(){
		
		List<TrainingCenter> allCenters = service.getAllTrainingCenters();
		
		if(allCenters.isEmpty()) {
			return new ArrayList<>();
		}
		
		return allCenters;
	}
	
	/* This API is to add the new training center */
	
	@PostMapping("add-center")
	public ResponseEntity<?> addTrainingCenter(@Valid @RequestBody TrainingCenter ts){

		TrainingCenter newOne = service.addTrainingCenter(ts);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(newOne);
	}
	
	/* This API filter the training center based on center name & center code & return a list */
	
	@GetMapping("search_training_center/{query}")
	public ResponseEntity<?> find_training_center(@PathVariable("query") String query){
		
		List<TrainingCenter> newOne =  service.find(query);
		
		if(newOne.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ArrayList<>());
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(newOne);
	}
}
