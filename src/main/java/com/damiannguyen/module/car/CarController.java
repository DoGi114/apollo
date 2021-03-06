package com.damiannguyen.module.car;

import com.damiannguyen.module.car.dto.CarDto;
import com.damiannguyen.module.car.mapper.CarMapper;
import com.damiannguyen.module.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "/api/cars/{id}")
	public CarDto getBook(@PathVariable Long id) {
		return CarMapper.map(carService.getOne(id));
	}

	@GetMapping("/api/cars")
	public List<CarDto> getBooks() {
		return CarMapper.map(carService.getAll());
	}

}
