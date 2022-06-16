package com.question1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Product  {
	private int productId;
	private String productName;
	private double productPrice;
	
	Product(){
		
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductIdr(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
//				+ "]";
//	}

	

	
	
	
}



class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		System.out.println("1 for sorting the product according to the productPrice");
		System.out.println("2 for sorting the product according to the productName");
		System.out.println("3 for sorting the product according to the productId");
		int choice=sc.nextInt();
		
		if(choice==1) {
			//TreeSet<Product> ts= new TreeSet<>(new ProductIdComp());
			//ProductPricecom p=new ProductPricecom();
			//TreeSet<Product> ts= new TreeSet<>(new ProductPricecom());
		}
		else if(choice ==2) {
			//ProductNameComp p= new ProductNameComp();
			//TreeSet<Product> ts= new TreeSet<>(new ProductNameComp());
		}
		else  {
			//Object p= new ProductIdComp();
			//TreeSet<Product> ts= new TreeSet<>(new ProductIdComp());
		}
		
		TreeSet<Product> ts= new TreeSet<>(new ProductIdComp());
		ts.add(new Product(101,"Mango",450));
		ts.add(new Product(105,"Apple",660));
		ts.add(new Product(108,"Banana",220));
		ts.add(new Product(104,"Orange",120));
		for(Product i:ts) {
			System.out.println(i.getProductId());
			System.out.println(i.getProductName());
			System.out.println(i.getProductPrice());
			System.out.println("=========================================");
		}
		//System.out.println(ts);
	}
}















