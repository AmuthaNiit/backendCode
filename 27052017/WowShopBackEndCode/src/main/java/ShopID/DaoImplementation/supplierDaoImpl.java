package ShopID.DaoImplementation;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import ShopID.Dao.supplierDao;
import ShopID.productModel.supplierModel;


public class supplierDaoImpl implements supplierDao {
	
	private Session currentSession;
	private Transaction currentTransaction;
	
	
	public supplierDaoImpl() {
		
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
	public List<supplierModel> listData() {
		// TODO Auto-generated method stub
		List<supplierModel> products = (List<supplierModel>) getCurrentSession().createQuery("from supplier").list();
        return products;
	}

	
	
	
	
	@Override
	public void persist(supplierModel obj) {
		// TODO Auto-generated method stub
		getCurrentSession().save(obj);
	}

	@Override
	public void updateData(supplierModel obj) {
		// TODO Auto-generated method stub
		getCurrentSession().update(obj);
	}

	@Override
	public void removedata(supplierModel obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public supplierModel getproduct(int id) {
		supplierModel product = (supplierModel) getCurrentSession().get(supplierModel.class, id);
		 return product;
	
	}

}
