package service;

import java.util.ArrayList;
import java.util.List;

import entity.Product;
import exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService{
	
	List<Product> allProducts = new ArrayList<>(
			List.of(new Product(1002, "Shirt", "Clothes", 560.00f, 40))
			);

	@Override
	public List<Product> getAllProducts() {
		return allProducts;
	}

	@Override
	public void searchProduct(int proId) throws ProductNotFoundException {
		for(Product pro:allProducts) {
			if(pro.getProId()==proId) {
				System.out.println(pro);
				return;
			}
		}
		throw new ProductNotFoundException("Product Not Found");
	}

	@Override
	public void addNewProduct(Product newPro) {
		allProducts.add(newPro);
	}

	@Override
	public void updateStock(int proId) {
	}

	@Override
	public void deleteProduct(int proId) {
	}

}
