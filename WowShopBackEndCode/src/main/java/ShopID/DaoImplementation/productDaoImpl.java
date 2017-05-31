
package ShopID.DaoImplementation;
import java.util.List;

import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ShopID.Dao.productDao;
import ShopID.Model.productModel;

@Repository
public class productDaoImpl implements productDao
{
	//private Session currentSession;
//	private Transaction currentTransaction;
	

     @Autowired
	private SessionFactory sessionFactory;

	public productDaoImpl() {
		
	}
	
	/*public Session openCurrentSession() {
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
    }*/

		public List<productModel> listData() {
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			Criteria query=s.createCriteria(productModel.class);        
			List<productModel> list=query.list();
			System.out.println(list);
			s.getTransaction().commit();
			return list;
		}
	


	public void updateData(productModel obj) {
		// TODO Auto-generated method stub
		//getCurrentSession().update(obj);
	}


	public void removedata(productModel obj) {
		// TODO Auto-generated method stub
		
	}


	public productModel getproduct(int id) {
		return null;
	/*	productModel product = (productModel) getCurrentSession().get(productModel.class, id);
		Session session = this.sessionFactory.getCurrentSession();		
		productModel p = (productModel) session.load(productModel.class, new Integer(id));
		p.toString();*/
		
		
		
		
	}

	public void persist(productModel obj) {
		// TODO Auto-generated method stub
		System.out.println("In persist");
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.clear();
		 
		
		
	}

}