package ShopID.Dao;

import java.util.List;

import ShopID.Model.categoryModel;


public interface categoryDao {
	
	public  List<categoryModel> listData(); 
	public void addCategory(categoryModel obj);
	public void updateData(categoryModel obj);
	public void removedata(categoryModel obj);
	public  categoryModel getproduct(int id); 

}
