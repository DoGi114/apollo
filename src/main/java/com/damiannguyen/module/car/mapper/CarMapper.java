package com.damiannguyen.module.car.mapper;

import com.damiannguyen.module.car.dto.CarDto;
import com.damiannguyen.module.car.entity.CarEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CarMapper {

	public static CarDto map(CarEntity entity) {
		return new CarDto()
				.setId(entity.getId())
				.setGuid(entity.getGuid())
				.setMake(entity.getMake())
				.setModel(entity.getModel())
				.setYear(entity.getYear())
				.setColor(entity.getColor())
				.setVin(entity.getVin())
				.setCompany(entity.getCompany())
				.setPrice(entity.getPrice())
				.setDetails(CarDetailsMapper.map(entity.getDetails()));
	}

	public static List<CarDto> map(List<CarEntity> entities) {
		return entities
				.stream()
				.map(CarMapper::map)
				.collect(Collectors.toList());
	}
}

