package com.question1;

import java.util.Comparator;
public class ProductNameComp implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
//		if(o1.getProductName().compareTo(null) o2.getProductName()) {
//			return +1;
//		}else if(o1.getProductName() < o2.getProductName()) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		//return a.name.compareTo(b.name);
		return o1.getProductName().compareTo(o2.getProductName());
		
	}

}
