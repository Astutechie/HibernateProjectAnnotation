package com.xyz.Hibernatedb;

import com.xyz.Hibernatedb.DAOImpl.ProductImpl;
import com.xyz.Hibernatedb.DAOModel.ProductModel;

public class AppConfig {

	public static void main(String[] args) {
		
		ProductModel p=new ProductModel();
		p.setPid(1001);
		p.setPname("apple");
		p.setPprice(100);
		
		ProductImpl pm=new ProductImpl();
		pm.addProduct(p);
		
		System.out.println("InsertedSucess");

	}

}
