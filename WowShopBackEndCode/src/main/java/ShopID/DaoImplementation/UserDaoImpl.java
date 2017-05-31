package ShopID.DaoImplementation;

import java.util.List;

import ShopID.Dao.UserDao;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class UserDaoImpl implements UserDao{
	
	private Session currentSession;
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

			
		

	public List<UserDao> listData() {
		List<UserDao> products = (List<UserDao>) getCurrentSession().createQuery("from User").list();
        return products;
		
	}

	public void persist(UserDao obj) {
		// TODO Auto-generated method stub
		getCurrentSession().save(obj);
	}

	
	public void updateData(UserDao obj) {
		// TODO Auto-generated method stub
		getCurrentSession().update(obj);
	}

	
	public void removedata(UserDao obj) {
		// TODO Auto-generated method stub
		
	}

	public UserDao getproduct(int id) {
		// TODO Auto-generated method stub
		UserDao product = (UserDao) getCurrentSession().get(UserDao.class, id);
		
		return product;
	}

}
