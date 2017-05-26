package ShopID.Config;

import ShopID.productModel.Model;
import ShopID.productService.productservice;

public class App {

	public static void main(String[] arg){
	
		productservice ps= new 	productservice();
		
    Model p1=new Model("101","Adidas","BlackGray","Shoes",2750,1,"Men Wear","Supplier");
	System.out.println("*** Persist - start ***");
   	ps.persist(p1);

}
}