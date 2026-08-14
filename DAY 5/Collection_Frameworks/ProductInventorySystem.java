import java.util.Scanner;

import entity.Product;
import exception.ProductNotFoundException;
import service.ProductServiceImpl;
public class ProductInventorySystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductServiceImpl service=new ProductServiceImpl();
		
		int choice =0;
		
		do {
			System.out.println("\nProduct Inventory System--------------- ");
			
			System.out.println("1.Show Products \n2.Search Product \n3.Add Product \n5.Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				for(Product pro: service.getAllProducts()) {
					System.out.println(pro);
				}
				break;
			case 2:
				System.out.println("Enter Product Id: ");
				int proid1 = sc.nextInt();
				try {
					service.searchProduct(proid1);
				} catch (ProductNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Type Product id ");
				int id = sc.nextInt();
				System.out.println("Type Product name ");
				String name = sc.next();
				System.out.println("Type Product category ");
				String category = sc.next();
				System.out.println("Type Product price ");
				float price = sc.nextFloat();
				System.out.println("Type Product Quantity ");
				int stock = sc.nextInt();
				

				service.addNewProduct(new Product(id, name, category, price, stock));
				break;
			}
		}
		while(choice!=5);
		sc.close();
	}

}
