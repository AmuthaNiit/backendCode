        package ShopID.Config;
         
        import java.util.Properties;
		import org.hibernate.HibernateException;
		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.cfg.AnnotationConfiguration;
		
		
		import ShopID.productModel.Model;

		public class HibernateConfig {
		private static final SessionFactory concreteSessionFactory;
		static {
		try {
		Properties prop= new Properties();
		prop.setProperty("hibernate.connection.url", "jdbc:h2:tcp://localhost/~/Shopping");
		prop.setProperty("hibernate.connection.username", "sa");
		prop.setProperty("hibernate.connection.password", "");
		prop.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "create");

		concreteSessionFactory = new AnnotationConfiguration()
		  .addPackage("com.concretepage.persistence")
		  .addProperties(prop)
		  .addAnnotatedClass(Model.class)
		  .buildSessionFactory();
		} catch (Throwable ex) {
		throw new ExceptionInInitializerError(ex);
		}
		}
		public static SessionFactory getSessionFactory()
		throws HibernateException {
		return concreteSessionFactory;
		}
		}
		
		