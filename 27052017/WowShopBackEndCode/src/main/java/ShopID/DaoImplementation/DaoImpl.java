
package ShopID.DaoImplementation;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



import ShopID.Dao.Dao;
import ShopID.productModel.Model;


public class DaoImpl implements Dao
{
	private Session currentSession;
	private Transaction currentTransaction;
	
	
	public DaoImpl() {
		
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

	
	
	
	public void addProduct(Model obj)
	{
		getCurrentSession().save(obj);
	}

	@Override
	public List<Model> listData() {
		// TODO Auto-generated method stub
		List<Model> products = (List<Model>) getCurrentSession().createQuery("from Product").list();
        return products;
	}

	

	@Override
	public void updateData(Model obj) {
		// TODO Auto-generated method stub
		getCurrentSession().update(obj);
	}

	@Override
	public void removedata(Model obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Model getproduct(int id) {
		Model product = (Model) getCurrentSession().get(Model.class, id);
		 return product;
		
	}

	public void persist(Model obj) {
		// TODO Auto-generated method stub
		
	}

}