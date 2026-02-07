package com.anudip.service;

import java.util.List;

import com.anudip.model.Product;

public interface IProductService {

	abstract String addProduct(Product prod);
	abstract Product viewProduct(int pid);
	abstract List<Product> viewAllProduct();
	String deleteProduct();
	String updateProduct();
}
