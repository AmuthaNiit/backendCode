package ShopID.DaoImplementation;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



import ShopID.Dao.categoryDao;
import ShopID.productModel.categoryModel;


public class categoryImplementation implements categoryDao
{
	private Session currentSession;
	private Transaction currentTransaction;
	
	
	public categoryImplementation() {
		
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

	
	
	
	
	@Override
	public List<categoryModel> listData() {
		// TODO Auto-generated method stub
		List<categoryModel> products = (List<categoryModel>) getCurrentSession().createQuery("from category").list();
        return products;
	}

	
	@Override
	public void updateData(categoryModel obj) {
		// TODO Auto-generated method stub
		getCurrentSession().update(obj);
	}

	/* @Override
	public void removedata(Model obj) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public categoryModel  getproduct(int id) {
		categoryModel product = (categoryModel) getCurrentSession().get(categoryModel.class, id);
		 return product;
		
	}

	@Override
	public void persist(categoryModel obj) {
		getCurrentSession().save(obj);
		
	}

	

	@Override
	public void removedata(categoryModel obj) {
		// TODO Auto-generated method stub
		
	}

}

