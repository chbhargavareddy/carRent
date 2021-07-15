package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.repo.CarRepo;
import com.example.exception.UserNotFoundExcrption;
import com.example.model.Car;



@Transactional
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
	public Car addCar(Car car)
	{
		return carRepo.save(car);
	}
	public Car updateCar(Car car)
	{
		return carRepo.save(car);
	}
	
	public void deleteCar(long id)
	{
		carRepo.deleteCarById(id);
	}
	
	public Car findCarById(long id)
	{
		return carRepo.findCarById(id).orElseThrow(()->new UserNotFoundExcrption("user by id " + id + " was not found "));
	}
	
}
