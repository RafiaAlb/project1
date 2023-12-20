package com.eif.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.eif.data.Orders;
import com.eif.repo.Orders_Repo;

@Service
public class OrederService {
	@Autowired
	private Orders_Repo os;
	public List<Orders> getOrders(){
		return os.findAll();
	}
		public Orders getOrders_byBrandName(String name) {
			return null;
		}
		
		
		public void addOrders(Orders os) {
			os.add(os);
		}

		@DeleteMapping
		public void delete (int id) {
			os.deleteById(id);
		}

		public Orders saveUser(Orders o) {
			return os.save(o);
			
		}

		public Orders getOrders_byRentalPrice(int rp) {
			// TODO Auto-generated method stub
			return os.getOrders_byRentalPrice(rp);
		}

		public Orders getOrders_byNoDays(int nd) {
			// TODO Auto-generated method stub
			return os.getOrders_byNoDays(nd);
		}

		public Orders getOrders_byTotalPrice(int tp) {
			// TODO Auto-generated method stub
			return os.getOrders_byTotalPrice(tp);
		}
		public void saveOrder(Orders o) {
			// TODO Auto-generated method stub
			
		}


	

	}
		
