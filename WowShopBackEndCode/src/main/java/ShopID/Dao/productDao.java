package ShopID.Dao;

import java.util.List;

import ShopID.Model.productModel; 

public interface productDao {
	
	public List<productModel> listData();
	public void persist(productModel obj);
	public void updateData(productModel obj);
	public void removedata(productModel obj);
	public  productModel getproduct(int id); 

}
