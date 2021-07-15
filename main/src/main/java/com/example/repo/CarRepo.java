package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.Car;

public interface CarRepo extends JpaRepository<Car, Long>
{

	void deleteCarById(long id);

	Car findCarById(long id);
	

}
