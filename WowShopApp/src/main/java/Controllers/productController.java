package Controllers;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.categoryDao;
import ShopID.Dao.productDao;
import ShopID.Dao.supplierDao;
import ShopID.Model.categoryModel;
import ShopID.Model.productModel;
import ShopID.Model.supplierModel;;

@Controller
public class productController {
	
	@Autowired
	 productDao product;
	@Autowired
	categoryDao cat;
	 public void categoryDao(productDao prod)
	 {
		 this.product=prod;
	 }
	 @Autowired
	 supplierDao sup;
	 
	 
	 public void supplierModel(productDao prod)
	 {
		 this.product=prod;
	 }


   @RequestMapping(value ="/product",method=RequestMethod.POST)
    public ModelAndView persist(HttpServletRequest request)
    {
        
    String p_id=String.valueOf(request.getParameter("pid"));
        String p_name=request.getParameter("pname");
        double p_price=  Double.parseDouble(request.getParameter("price"));
        
        System.out.println("cname     " +request.getParameter("cname")+" sname  " +request.getParameter("psid" ));
      int p_cat=Integer.parseInt(request.getParameter("cname"));
      int p_sc= Integer.parseInt(request.getParameter("psid"));  
       
      categoryModel c =cat.getproduct(p_cat);
        c.toString();
       supplierModel s=sup.getproduct((p_sc));
        s.toString();
        System.out.println(p_id+"---"+p_name+"---"+p_price+"-yyy--");
        productModel p= new productModel();
        p.setId(p_id);
        p.setPname(p_name);
        p.setPrice(p_price);
        p.setCategory(c);
        p.setSupplier(s);
        System.out.println(p_id+"---"+p_name+"---"+p_price+"-rrr--");
              
        product.persist(p);
        System.out.println(p_id+"---"+p_name+"---"+p_price+"---eee");
        ModelAndView mv = new ModelAndView("adding");
        return mv;  
    	}
	
	/* @RequestMapping(value ="/product",method=RequestMethod.POST)
	    public ModelAndView persist(@RequestParam("file")MultipartFile file,HttpServletRequest request)
	    {
	        
	    String p_id=String.valueOf(request.getParameter("pid"));
	        String p_name=request.getParameter("pname");
	        double p_price=  Double.parseDouble(request.getParameter("price"));
	        
	        System.out.println("cname     " +request.getParameter("cname")+" sname  " +request.getParameter("psid" ));
	      int p_cat=Integer.parseInt(request.getParameter("cname"));
	      int p_sc= Integer.parseInt(request.getParameter("psid"));  
	      
	      categoryModel c =cat.getproduct(p_cat);
	        c.toString();
	       supplierModel s=sup.getproduct((p_sc));
	        s.toString();
	        System.out.println(p_id+"---"+p_name+"---"+p_price+"-yyy--");
	        productModel p= new productModel();
	        p.setId(p_id);
	        p.setPname(p_name);
	        p.setPrice(p_price);
	        p.setCategory(c);
	        p.setSupplier(s);
	        System.out.println(p_id+"---"+p_name+"---"+p_price+"-rrr--");
	        product.persist(p);
	        System.out.println(p_id+"---"+p_name+"---"+p_price+"---eee");
	        String filepath = request.getSession().getServletContext().getRealPath("/");
	        String originalfile = file.getOriginalFilename();
	        System.out.println(filepath+originalfile);
	        //String filename = filepath + "\\" + product.getProductId() + ".jpg";
	        //System.out.println("File Path File "+filepath);
	        try {
	        byte imagebyte[] = file.getBytes();
	        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath+"/resources/images/"+originalfile));
	        fos.write(imagebyte);
	        fos.close();
	        } catch (IOException e) {
	        e.printStackTrace();
	        } catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        }
	        ModelAndView mv=new ModelAndView("index");
	        return mv;   
	        
	        
	    	}*/

}
