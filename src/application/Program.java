package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		DepartmentDao depDao = DaoFactory.createDepartmentDAO();
		System.out.println(">>>> TEST D01 - findById na tabela department");
		Department dep = depDao.findById(1);
		System.out.println(dep);
		
		
		
		
		
		/*
		 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TEST 01: Seller findbyId ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 02: Seller findbyDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 03: Seller findbyAll ====");
		list = sellerDao.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
			
		}
		
		
		System.out.println("\n==== TEST 04: Seller insert ====");
		Seller newSeller = new Seller(null, "Greg","greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = "+ newSeller.getId());
		
		
		System.out.println("\n==== TEST 05: Seller Updated ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n==== TEST 06: Seller Delete ====");
		System.out.println("Enter id for delete");
		int id = scan.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete");
		scan.close();
		
		*/
		
		
		
		
		
		
	}
}
