package ShopID.Dao;
import java.util.List;

import ShopID.Model.orderModel;;


public interface orderDao {
	public List<orderModel> listData();
	public void persist(orderModel obj);
	public void updateData(orderModel obj);
	public void removedata(orderModel obj);
	public  orderModel getproduct(int id); 
}
