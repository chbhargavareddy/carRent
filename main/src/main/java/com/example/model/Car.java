package com.example.model;


//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name = "car")
public class Car 
{



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "car_id",nullable = false , updatable = false)
	private Long id ; 
	
	@Column(name = "car_brand")
	private String brand;
	
	@Column(name = "car_color")
	private String color;
	
	@Column(name = "car_vehicle_number")
	private String vehicleNumber;
	
	@Column(name= "car_price")
	private Integer price;
	
	@Column(name="car_image_url")
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

	public Car() 
	{
		
		
	}

	
	public Car(String brand, String color, String vehicleNumber, Integer price, String imageUrl) {
		super();
		this.brand = brand;
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.price = price;
		this.imageUrl = imageUrl;
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
