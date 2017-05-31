package ShopID.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import ShopID.Model.productModel;
import ShopID.Model.cartModel;
import ShopID.Model.categoryModel;
import ShopID.Model.customerModel;
import ShopID.Model.orderModel;
import ShopID.Model.supplierModel;
import ShopID.Model.userModel;


//import com.niit.service.ProductService;

@Configuration
@ComponentScan("ShopID.HibernateConfig")
@EnableTransactionManagement
public class HibernateConfig 
{
	   @Autowired
	    @Bean(name = "dataSource")
	    public DataSource getH2DataSource() {

	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	            
	        dataSource.setUrl("jdbc:h2:tcp://localhost/~/shopdb");

	        dataSource.setDriverClassName("org.h2.Driver");

	        dataSource.setUsername("sa");
	        dataSource.setPassword("");
	        
	        
	        return dataSource;
	    }
	    
	   private Properties getHibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.show_sql", "true");
	        properties.put("hibernate.hbm2ddl.auto", "update");
	        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	        properties.put("hibernate.format_sql", "true");
	        return properties;
	    }
	   @Autowired
	    @Bean(name = "sessionFactory")
	    public SessionFactory getSessionFactory(DataSource dataSource) {

	        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	        sessionBuilder.addProperties(getHibernateProperties());
	        sessionBuilder.addAnnotatedClass(productModel.class);
	        sessionBuilder.addAnnotatedClass(categoryModel.class);
	        sessionBuilder.addAnnotatedClass(userModel.class);
	        sessionBuilder.addAnnotatedClass(customerModel.class);
	        sessionBuilder.addAnnotatedClass(supplierModel.class);
	        sessionBuilder.addAnnotatedClass(cartModel.class);
	        sessionBuilder.addAnnotatedClass(orderModel.class);
	        return sessionBuilder.buildSessionFactory();
	    }

	   
	    @Autowired
	    @Bean(name = "transactionManager")
	    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

	        return transactionManager;
	    }

	    
	    
	   /* @Autowired(required = true)
	    @Bean(name = "ProductService")
	    public ProductService getProductDAO(SessionFactory sessionFactory) {
	        return new ProductService(sessionFactory);
	    }*/
}
	   