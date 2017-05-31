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
//import org.hibernate.query;
import org.springframework.transaction.annotation.Transactional;

import ShopID.Dao.supplierDao;
import ShopID.Model.supplierModel;

@Repository
public class supplierDaoImpl implements supplierDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	public supplierDaoImpl() {
		
	}
	
	/* public Session openCurrentSession() {
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
	
	
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	

	public List<supplierModel> listData() {
		// TODO Auto-generated method stub
		
		
		Session session= this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<supplierModel> list=session.createQuery("from supplierModel").list();
		session.close();
		return list;	
	}

	public void persist(supplierModel obj) {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.clear();
	 

	}

	public void updateData(supplierModel obj) {
		// TODO Auto-generated method stub
		//getCurrentSession().update(obj);
	}

	public void removedata(supplierModel obj) {
		// TODO Auto-generated method stub
		
	}


	public supplierModel getproduct(int id) {
		// TODO Auto-generated method stub
		
		supplierModel s=(supplierModel)sessionFactory.openSession().get(supplierModel.class,id);
		
		return s;
		
	}

	
	
	}


