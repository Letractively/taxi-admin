package ru.dreamjteam.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class CarTypeVO implements Serializable {
	private final Integer id;
	private final Integer capacity;
	private final Integer costPerKm;
	private final String name;
	private List<CarVO> carVOs;

	public CarTypeVO(Integer id, Integer capacity, Integer costPerKm, String name) {
		this.id = id;
		this.capacity = capacity;
		this.costPerKm = costPerKm;
		this.name = name;
                carVOs = new ArrayList<CarVO>();
	}


	public Integer getId() {
		return id;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public Integer getCostPerKm() {
		return costPerKm;
	}

	public String getName() {
		return name;
	}

	public List<CarVO> getCarVOs() {
		if (carVOs == null)
			throw new IllegalStateException("car == null cause lazy initialization");
		return carVOs;
	}

	public void setCarVOs(List<CarVO> carVOs) {
		this.carVOs = carVOs;
	}
}
