package ShopID.DaoImplementation;



import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ShopID.Dao.categoryDao;
import ShopID.Model.categoryModel;



@Repository
public class categoryImplementation implements categoryDao
{


	 @Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}


	
	
	public List<categoryModel> listData() {
		//Session session=this.sessionFactory.getCurrentSession();
		Session session=sessionFactory.openSession();
//		session.beginTransaction();
		
		/*@SuppressWarnings("unchecked")*/
		
		List<categoryModel> list=session.createQuery("from categoryModel").list();
		session.close();
	/*	System.out.println("working");
		
		for(categoryModel p : list){
			System.out.println("category List:"+p);
		}
		System.out.println(list.toString());*/
		/*session.close();*/
		return list;
		
		
		
	}
	
		
		
		
		
		
	
	
	public void addCategory(categoryModel category)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(category);
		s.getTransaction().commit();
		s.clear();
	}

	
	public void updateData(categoryModel obj) {
		// TODO Auto-generated method stub
		
	}

	public void removedata(categoryModel obj) {
		// TODO Auto-generated method stub
		
	}

	public categoryModel getproduct(int id) {
		 categoryModel c=(categoryModel)sessionFactory.openSession().get(categoryModel.class, id);
		
		return c;
	}

	
	/* @Autowired
	 
   private SessionFactory sessionFactory;
	
	public void addCategory(CategoryModel category)
	{
		 sessionFactory.getCurrentSession().saveOrUpdate(category);
    }
		*/
		
	

	
    
}
