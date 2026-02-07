package com.anudip.service;

import java.util.ArrayList;
import java.util.List;

import com.anudip.model.Product;

public class ProductServiceImpl implements IProductService {

	ArrayList<Product> al = new ArrayList<Product>();
	
	@Override
	public String addProduct(Product prod) {
		al.add(prod);		
		return "Product Added Successfully";
	}

	@Override
	public Product viewProduct(int pid) {
		
	  for(Product prod : al) {
		  if(prod.getPid()==pid) {
			 return prod;
		  }
	  }
		return null;
	}

	@Override
	public List<Product> viewAllProduct() {		
		return al;
	}

	@Override
	public String deleteProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
