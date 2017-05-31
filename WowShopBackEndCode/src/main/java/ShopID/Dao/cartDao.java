package ShopID.Dao;

import java.util.List;

import ShopID.Model.cartModel;

public interface cartDao {
	
	public List<cartModel> listData();
	public void persist(cartModel obj);
	public void updateData(cartModel obj);
	public void removedata(cartModel obj);
	public  cartModel getproduct(int id); 

}
