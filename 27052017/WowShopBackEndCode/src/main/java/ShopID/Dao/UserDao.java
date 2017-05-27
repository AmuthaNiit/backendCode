package ShopID.Dao;

import java.util.List;

public interface UserDao {
	
	public List<UserDao> listData();
	public void persist(UserDao obj);
	public void updateData(UserDao obj);
	public void removedata(UserDao obj);
	public  UserDao getproduct(int id);

}
