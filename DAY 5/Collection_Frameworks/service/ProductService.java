package service;

import java.util.List;

import entity.Product;
import exception.ProductNotFoundException;

public interface ProductService {
	
	List<Product> getAllProducts();
	void searchProduct(int proId) throws ProductNotFoundException;
	void addNewProduct(Product newPro);
	void updateStock(int proId);
	void deleteProduct(int proId);
	

}
