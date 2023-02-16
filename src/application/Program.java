package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	/*PAREI NA AULA 284*/

	public static void main(String[] args) {
		Department obj = new Department(1, "BOOKS");
		System.out.println(obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("===TESTE1: SELLER FINDBYID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===TESTE2: SELLER FINDBYID ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		
		for (Seller obj1 : list) {
			System.out.println(obj1);
		}
		
		System.out.println("\n===TESTE2: SELLER FINDBYID ===");
		list = sellerDao.findAll();
		for (Seller obj2 : list) {
			System.out.println(obj2);
		}

	}

}
