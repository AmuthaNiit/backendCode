package ShopID.Dao;

import java.util.List;

import ShopID.productModel.Model;


public interface Dao extends java.io.Serializable{
	
	public List<Model> listData();
	public void persist(Model obj);
	public void updateData(Model obj);
	public void removedata(Model obj);
	public  Model getproduct(int id); 

}
