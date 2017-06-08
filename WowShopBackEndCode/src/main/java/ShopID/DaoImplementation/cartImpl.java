package ShopID.DaoImplementation;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ShopID.Dao.cartDao;
import ShopID.Model.cartModel;

@Repository
public class cartImpl implements cartDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void save(cartModel cart1)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(cart1);
		s.getTransaction().commit();
		s.close();
		
	}

	public cartModel getId(int id) {
		// TODO Auto-generated method stub
		return (cartModel)sessionFactory.openSession().get(cartModel.class,id);
	}

	public void update(cartModel cart) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();

		cartModel cart=(cartModel)session.get(cartModel.class,id);
		session.delete(cart);
		session.getTransaction().commit();

	}

	public List<cartModel> getAll() {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession(); 
		List<cartModel> clist=s.createCriteria(cartModel.class).list();
		s.clear();
		return clist;
		
		
	}

	public List<cartModel> checkExistance(int pid) {
		// TODO Auto-generated method stub
        Session s=sessionFactory.openSession();		
        List<cartModel> results =s.createQuery("from cartModel where productid="+pid).list();		
		s.close();
		return results;

	}
	      
		
}

	




