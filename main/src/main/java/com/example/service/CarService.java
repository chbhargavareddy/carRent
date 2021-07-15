package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.CarRepo;
import com.example.model.Car;


@Service
public class CarService 
{
	private final CarRepo carRepo;

	@Autowired
	public CarService(CarRepo carRepo)
	{
		this.carRepo= carRepo;
		
	}
	
	public List<Car> findAllCar()
	{
		return carRepo.findAll();
	}
	
	public Car updateCar(Car car)
	{
		return carRepo.save(car);
	}
	
	public void deleteCar(long id)
	{
		carRepo.deleteCarById(id);
	}



}
