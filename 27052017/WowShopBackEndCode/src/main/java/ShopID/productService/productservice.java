 package ShopID.productService;

import java.util.List;

import ShopID.DaoImplementation.DaoImpl;
import ShopID.productModel.Model;


public class productservice {
	
	private static  DaoImpl productdaoimpl;
    
	public productservice() {
		productdaoimpl = new DaoImpl();
    }

    public void persist(Model entity) {
        productdaoimpl.openCurrentSessionwithTransaction();
        productdaoimpl.persist(entity);
        productdaoimpl.closeCurrentSessionwithTransaction();
    }

    public void update(Model entity) {
        productdaoimpl.openCurrentSessionwithTransaction();
        productdaoimpl.updateData(entity);
        productdaoimpl.closeCurrentSessionwithTransaction();
    }

  /*  public Model findByProductId(String productid) {
        productdaoimpl.openCurrentSession();
        Product product = productdaoimpl.findByProductId(productid);
        productdaoimpl.closeCurrentSession();
        return product; 
    } */

   /* public void delete(String productid) {
        productdaoimpl.openCurrentSessionwithTransaction();
        Model product = productdaoimpl.findByProductId(productid);
        productdaoimpl.delete(product);
        productdaoimpl.closeCurrentSessionwithTransaction();
    }*/

    public List<Model> listData() {
        productdaoimpl.openCurrentSession();
        List<Model> product = productdaoimpl.listData();
        productdaoimpl.closeCurrentSession();
        return product;
    }

    public void deleteAll() {
        productdaoimpl.openCurrentSessionwithTransaction();
        productdaoimpl.listData();
        productdaoimpl.closeCurrentSessionwithTransaction();
    }

   /*public ProductImpl getProductImpl() {
        return shoesimpl;*/
   }

	
	
	
