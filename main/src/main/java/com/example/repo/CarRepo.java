package com.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.Car;


public interface CarRepo extends JpaRepository<Car, Long>
{

	void deleteCarById(long id);

	Optional<Car>findCarById(long id);

	

}
