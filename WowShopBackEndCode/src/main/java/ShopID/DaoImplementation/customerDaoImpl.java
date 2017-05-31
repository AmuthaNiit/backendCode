package ShopID.DaoImplementation;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ShopID.Dao.customerDao;
import ShopID.Model.customerModel;


@Repository
@Transactional
public class customerDaoImpl implements customerDao {
	
	private Session currentSession;
		private Transaction currentTransaction;
		
		
		public customerDaoImpl() {
			
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

		
		
		
	

		
		public List<customerModel> listData() {
			// TODO Auto-generated method stub
			List<customerModel> products = (List<customerModel>) getCurrentSession().createQuery("from customer").list();
	        return products;
		}


		public void persist(customerModel obj) {
			// TODO Auto-generated method stub
			getCurrentSession().save(obj);
		}

		public void updateData(customerModel obj) {
			// TODO Auto-generated method stub
			getCurrentSession().update(obj);
		}


		public void removedata(customerModel obj) {
			// TODO Auto-generated method stub
			
		}


		public customerModel getproduct(int id) {
			// TODO Auto-generated method stub
			
			customerModel product = (customerModel) getCurrentSession().get(customerModel.class, id);
			 return product;
			
		}


}
