package com.cts.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.model.Laptop;
import com.cts.service.LapotopService;

@Controller
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping(value="/allLaptop")
	public ResponseEntity<?> laptopList()
	{
		return new ResponseEntity<List<Laptop>>(laptopService.allLaptop(),HttpStatus.OK);
	}
	
	@GetMapping(value="/topFiveLaptop")
	public ResponseEntity<?> topFiveStocks()
	{
		return new ResponseEntity<List<laptop>>(laptopService.topFiveLaptop(),HttpStatus.OK);
	}
	
	@GetMapping(value="/searchLaptopById/{id}")
	public ResponseEntity<?> searchLaptopById(@PathVariable("id") int id)
	{
		Laptop stck = laptopService.searchLaptopById(id);
		if(s==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Laptop>(stck,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchSLaptopByName/{name}")
	public ResponseEntity<?> searchLaptopById(@PathVariable("name") String name)
	{
		Laptop s = laptopService.searchLaptopByName(name);
		if(s==null){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<laptop>>(s,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchLaptopByPrice/{startPrice}/{endPrice}")
	public ResponseEntity<?> searchStockByPrice(@PathVariable("startPrice") Double startPrice, @PathVariable("endPrice") Double endPrice )
	{
		List<laptop> s = laptopService.searchLaptopByPrice(startPrice,endPrice);
		if(s.size()==0){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Stock>>(s,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchLaptopByVolume/{startVolume}/{endVolume}")
	public ResponseEntity<?> searchStockByVolume(@PathVariable("startVolume") Double startVolume, @PathVariable("endVolume") Double endVolume )
	{
		List<Laptop> s = laptopService.searchLaptopByVolume(startVolume,endVolume);
		if(s.size()==0){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Laptop>>(s,HttpStatus.OK);
	}
	
	@GetMapping(value="/searchLaptopByDate/{startDate}/{endDate}")
	public ResponseEntity<?> searchLaptopById(@PathVariable("startDate") Date startDate, @PathVariable("endDate") Date endDate )
	{
		List<Laptop> s = laptopService.searchLaptopByDate(startDate,endDate);
		if(s.size()==0){
			return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<laptop>>(s,HttpStatus.OK);
	}
}