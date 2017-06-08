package ShopID.Dao;

import java.util.List;

import ShopID.Model.cartModel;

public interface cartDao {
	
	public void save(cartModel cart);
    //read
		public cartModel getId(int id);
		//update
		public void update(cartModel cart);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<cartModel> getAll();
		
		public List<cartModel> checkExistance(int pid);
		



}
