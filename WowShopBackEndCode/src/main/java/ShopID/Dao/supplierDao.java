package ShopID.Dao;

import java.util.List;

import ShopID.Model.supplierModel;

public interface supplierDao {
	
	public List<supplierModel> listData();
	public void persist(supplierModel obj);
	public void updateData(supplierModel obj);
	public void removedata(supplierModel obj);
	public  supplierModel getproduct(int id); 


}
