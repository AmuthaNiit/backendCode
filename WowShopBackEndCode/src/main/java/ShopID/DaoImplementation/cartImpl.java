package ShopID.DaoImplementation;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import ShopID.Dao.cartDao;
import ShopID.Model.cartModel;

@Repository
public class cartImpl implements cartDao{
	
	private Session currentSession;
	private Transaction currentTransaction;
		
		
		public cartImpl() {
			
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

		
		
		
	
		public List<cartModel> listData() {
			// TODO Auto-generated method stub
			List<cartModel> products = (List<cartModel>) getCurrentSession().createQuery("from cart").list();
	        return products;
		}
	
		
		
		
	
		public void persist(cartModel obj) {
			// TODO Auto-generated method stub
			getCurrentSession().save(obj);
		}

		public void updateData(cartModel obj) {
			// TODO Auto-generated method stub
			getCurrentSession().update(obj);
		}

		

	
		public cartModel getproduct(int id) {
			cartModel product = (cartModel) getCurrentSession().get(cartModel.class, id);
			 return product;
		
		}

		public void removedata(cartModel obj) {
			// TODO Auto-generated method stub
			
		}

		
	}



