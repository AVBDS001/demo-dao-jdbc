package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "BOOKS");
		System.out.println(obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("===TESTE1: SELLER FINDBYID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
