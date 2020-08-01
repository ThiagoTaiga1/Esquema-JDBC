package application;

import java.sql.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Department obj = new Department (1 ,"books");
		
		Seller seller = new Seller(21,"Ana","anacarola@gmail.com",new Date(0),300.0,obj);
				
		System.out.println(seller);
		
	}

}
