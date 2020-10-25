package com.damiannguyen.module.car.service;

import com.damiannguyen.module.car.repository.CarRepository;
import com.damiannguyen.module.car.entity.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public CarEntity getOne(Long id) {
		return carRepository.getOne(id);
	}

	public List<CarEntity> getAll() {
		return carRepository.findAll();
	}

}

