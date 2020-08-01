package application;

import java.sql.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Department obj = new Department (1 ,"books");
		
		Seller seller = new Seller(21,"Ana","anacarola@gmail.com",new Date(0),300.0,obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}

}
