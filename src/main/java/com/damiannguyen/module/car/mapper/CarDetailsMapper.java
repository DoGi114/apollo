package com.damiannguyen.module.car.mapper;

import com.damiannguyen.module.car.dto.CarDetailsDto;
import com.damiannguyen.module.car.entity.CarDetailsEntity;

public class CarDetailsMapper {

	public static CarDetailsDto map(CarDetailsEntity details) {
		if (details == null) {
			return new CarDetailsDto();
		}
		return new CarDetailsDto()
				.setFirstName(details.getFirstName())
				.setLastName(details.getLastName());
	}
}

