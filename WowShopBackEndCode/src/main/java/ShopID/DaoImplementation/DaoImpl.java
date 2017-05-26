package ShopID.DaoImplementation;

import ShopID.Config.HibernateConfig;

 

import java.util.ArrayList;
import java.util.List;

import ShopID.Dao.Dao;
import ShopID.productModel.Model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;




public class DaoImpl implements  Dao{
	
	List<Model> productDetails =null;
	
	private Session currentSession;
    private Transaction currentTransaction;
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

      /*  Configuration configuration = new Configuration().configure();

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

                .applySettings(configuration.getProperties()); 

        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());*/
        return HibernateConfig.getSessionFactory();
    	
    	 

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


    public void persist(Model entity) {

        getCurrentSession().save(entity);

    }

 

    
	/*public DaoImpl()
	{
		productDetails =new ArrayList<Model>();

		Model m1= new Model("111", "branded", "Karishma", "Fancy type", 1000,12,"Saree",
					"KMp Co.");
		Model m2 = new Model("112", "Handlom", "Kalasetra", "Cottorn type", 1500,12,"Saree","KMp Co.");


		productDetails.add(m1);
		productDetails.add(m2);
	}*/
   
    @Override
	public List<Model> listData() {
		// TODO Auto-generated method stub
		return productDetails;
	}
    @Override
	public  Model getproduct(int id){
		return null;
		
	
	}
	
	
/*	public void addData(Model obj) {
		// TODO Auto-generated method stub
		productDetails.add(obj);
	}
*/
	
	public void updateData(Model entity) {
		// TODO Auto-generated method stub
		 getCurrentSession().update(entity);
		
		
	}
	@Override
	public void removedata(Model obj) {
		// TODO Auto-generated method stub
		productDetails.remove(obj.getId());
	}
	
	

}
