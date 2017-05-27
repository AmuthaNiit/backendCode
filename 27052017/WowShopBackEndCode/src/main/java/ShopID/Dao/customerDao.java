package ShopID.Dao;

import java.util.List;

import ShopID.productModel.customerModel;

public interface customerDao {
	

public List<customerModel> listData();
	public void persist(customerModel obj);
	public void updateData(customerModel obj);
	public void removedata(customerModel obj);
	public  customerModel getproduct(int id); 

}
