package ShopID.DaoImplementation;

import java.util.List;

import ShopID.Dao.UserDao;
import ShopID.Model.userModel;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	
	 @Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
	
	/*private Session currentSession;
		private Transaction currentTransaction;
		
		public UserDaoImpl() {
			
		}
		
		public Session openCurrentSession() {
		    currentSession = getSessionFactory().openSession();
		    return currentSession;
	    }
		
		public Session openCurrentSessionwithTransaction() {
				currentSession = getSessionFactory().openSession();
				currentTransaction = currentSession.beginTransaction();
				return currentSession;
		}

	    public void closeCurrentSession() {
	    		currentSession.close();
	    }
	    
	     public void closeCurrentSessionwithTransaction() {
	         	currentTransaction.commit();
	         	currentSession.close();
	     }
	     
		 private static SessionFactory getSessionFactory() {
			     
	             Configuration configuration = new Configuration().configure();
	             StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
	                .applySettings(configuration.getProperties());
	             SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
	             return sessionFactory;
	     }
		
		    public Session getCurrentSession() {
			 	return currentSession;
	     }

	    public void setCurrentSession(Session currentSession) {
	        	this.currentSession = currentSession;
	     }

	    public Transaction getCurrentTransaction() {
	             return currentTransaction;
	     }

	     public void setCurrentTransaction(Transaction currentTransaction) {
	    	 	this.currentTransaction = currentTransaction;
	    }
*/
			
		

	public List<userModel> listData() {
	//	List<userModel> products = (List<userModel>) getCurrentSession().createQuery("from User").list();
        return null;
		
	}

	public void persist(userModel obj) {
		// TODO Auto-generated method stub
		System.out.println("Inside persist");
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.clear();
	}

	
	public void updateData(userModel obj) {
		// TODO Auto-generated method stub
		//getCurrentSession().update(obj);
	}

	
	public void removedata(UserDao obj) {
		// TODO Auto-generated method stub
		
	}

	public userModel getproduct(int id) {
		return null;
		// TODO Auto-generated method stub
	//	userModel product = (userModel) getCurrentSession().get(UserDao.class, id);
		
		//return product;
	}

	@Override
	public void removedata(userModel obj) {
		// TODO Auto-generated method stub
		
	}

}
