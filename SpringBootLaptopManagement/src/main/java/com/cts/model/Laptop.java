package com.cts.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;


@Entity
@Table(name="laptops")
public class Laptop {

	private int laptopId;
	private String laptopName;
	private double price;
	private double volume;
	private Date date;
	
	
	
	public Laptop() {
	
	}
	public Laptop(int laptopId, String laptopName, double price, double volume, Date date) {
		
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.price = price;
		this.volume = volume;
		this.date = date;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getlaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	
	@Column(name = "laptop_name", nullable = false)
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	@Column(name = "price", nullable = false)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name = "volume", nullable = false)
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	@Column(name = "date", nullable = false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", price=" + price + ", volume=" + volume
				+ " , date =" + date + " ]";
	}
}
