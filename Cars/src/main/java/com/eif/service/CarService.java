package com.eif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.eif.data.Cars;
import com.eif.repo.Cars_Repo;

@Service


public class CarService {
	@Autowired
	private Cars_Repo cs;
	public List<Cars> getUsers(){
		return cs.findAll();
	}
	
		
		
		public void addCar(Cars cs) {
			cs.add(cs);
		}

		@DeleteMapping
		public void delete (int id) {
			cs.deleteById(id);
		}

		public Cars saveCar(Cars c) {
			return cs.save(c);
			
		}
		public Cars getCars_byBrandName(String name) {
			return null;
		}
		
		public Cars getCars_bySize(String Size) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Cars getCars_byModel( String model) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Cars getCars_bySeats(int num) {
			// TODO Auto-generated method stub
			return cs.getCars_bySeats(num);
		}

		public Cars getCars_byPricePerDay(int num) {
			// TODO Auto-generated method stub
			return cs.getCars_byPricePerDay(num);
		}


		public Cars getCars_byColor(String Color) {
			// TODO Auto-generated method stub
			return null;
		}

		public Cars getCars_byYear(int num) {
			// TODO Auto-generated method stub
			return cs.getCars_byYear(num);
		}
		
		public Cars getCars_byExtras(String ex) {
			// TODO Auto-generated method stub
			return null;
		}
		public List<Cars> getCars() {
			// TODO Auto-generated method stub
			return null;
		}
	}
		
