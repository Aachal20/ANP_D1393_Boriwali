package com.anudip.controller;

import java.util.List;
import java.util.Scanner;

import com.anudip.model.Product;
import com.anudip.service.ProductServiceImpl;

public class ProductController {

	public static void main(String[] args) {

		ProductServiceImpl impl = new ProductServiceImpl();

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Add Product");
			System.out.println("2. view Product");
			System.out.println("3. viewAll Product");
			System.out.println("4. Update Product");
			System.out.println("5. delete Product");

			System.out.println("Enter your Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("===========Add Product opearation==========");
				
				System.out.println("Enter pid");
				int productId = sc.nextInt();
				System.out.println("Enter prod name");
				String productName = sc.next();
				System.out.println("Enter product prize");
				String productPrize = sc.next();
				
				Product prod = new Product(productId,productName,productPrize );
				String result = impl.addProduct(prod);
				System.out.println(result);
				break;

			case 2:			
				System.out.println("view Product");
				System.out.println("Enter prod id to view the product");
				int pid = sc.nextInt();
				Product viewProduct = impl.viewProduct(pid);
				System.out.println(viewProduct);
				break;

			case 3:			
				System.out.println("view All Product List");
				List<Product> allProduct = impl.viewAllProduct();
				for(Product p : allProduct) {
					System.out.println(p);
				}
				break;
				
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
