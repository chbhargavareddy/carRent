package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false , updatable = false)
	private Long id ; 
	
	private String brand;
	
	private String color;
	
	private String vehicleNumber;
	
	private Integer price;
	
	private String imageUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", color=" + color + ", vehicleNumber=" + vehicleNumber
				+ ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Long id, String brand, String color, String vehicleNumber, Integer price, String imageUrl) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	
	
}
