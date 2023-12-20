package com.eif.repo;

import java.util.List;

import com.eif.data.Orders;

public interface Orders_Repo {

	List<Orders> findAll();

	void deleteById(int id);

	Orders save(Orders o);

	Orders getOrders_byRentalPrice(int rp);

	Orders getOrders_byNoDays(int nd);

	Orders getOrders_byTotalPrice(int tp);

}
