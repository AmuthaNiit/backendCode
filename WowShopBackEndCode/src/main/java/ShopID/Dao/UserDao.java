package ShopID.Dao;

import java.util.List;

import ShopID.Model.userModel;

public interface UserDao {
	
	public List<userModel> listData();
	public void persist(userModel obj);
	public void updateData(userModel obj);
	public void removedata(userModel obj);
	public  userModel getproduct(int id);

}
