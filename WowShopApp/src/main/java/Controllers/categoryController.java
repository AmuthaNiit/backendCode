package Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.categoryDao;
import ShopID.Dao.productDao;
import ShopID.Dao.supplierDao;
import ShopID.Model.categoryModel;
import ShopID.Model.productModel;
import ShopID.Model.supplierModel;

@Controller
public class categoryController {
 

	 @Autowired
	 categoryDao category;
	 public void categoryDao(categoryDao category)
	 {
		 this.category=category;
	 }
	 
	 @Autowired
	 supplierDao supplier;
	 public void supplierDao(supplierDao supp)
	 {
		 this.supplier=supp;
	 }

	 @Autowired
	 productDao pdao;
	 
	 
	 @RequestMapping(value ="/add")    
	    public ModelAndView add() {
	        
         List<categoryModel> list=category.listData();
         List<supplierModel> slist=supplier.listData();
         ModelAndView mv = new ModelAndView("adding");
         //System.out.println(list.get(0).getC_name());    
 //        mv.addObject("slist", slist);
         mv.addObject("clist", list);
         mv.addObject("slist",slist);
         return mv;

	    }
	 @RequestMapping(value ="/category")
	    public ModelAndView addcategory(HttpServletRequest request)
	    {
	        
		 int c_id=Integer.valueOf(request.getParameter("c_id"));
			String c_name=request.getParameter("c_name");
			System.out.println(c_id+"---"+c_name);
			category.addCategory(new categoryModel(c_id, c_name));
			ModelAndView mv = new ModelAndView("adding");
			return mv;
	    }
	

//Code added from here----

@RequestMapping(value ="/product_delete")
public ModelAndView delete(HttpServletRequest request)
{
	
	productModel p= pdao.getproduct(request.getParameter("id"));
	System.out.println(p.toString());
	pdao.removedata(p);
    List<productModel> list= pdao.listData();
    ModelAndView mv = new ModelAndView("adding");	
    mv.addObject("list",list);
   return mv;
 
}


@RequestMapping(value="/product_edit")
public ModelAndView editProducts(HttpServletRequest request){	
String id=request.getParameter("id");
System.out.println("Id===="+id);
ModelAndView mv=new ModelAndView("productedit");


List<categoryModel>list= category.listData();

List<supplierModel> slist=supplier.listData();

//System.out.println("printing"+pdao.getproduct(id).toString());
productModel p=pdao.getproduct(id);
mv.addObject("product",p);
mv.addObject("slist", slist);
mv.addObject("clist", list);
return mv;
}


@RequestMapping(value = "/product_update")
public ModelAndView persist(HttpServletRequest request)
{
    
String p_id=String.valueOf(request.getParameter("pid"));
    String p_name=request.getParameter("pname");
    double p_price=  Double.parseDouble(request.getParameter("price"));
    
    System.out.println("cname     " +request.getParameter("cname")+" sname  " +request.getParameter("psid" ));
  int p_cat=Integer.parseInt(request.getParameter("cname"));
  int p_sc= Integer.parseInt(request.getParameter("psid"));  
  System.out.println(p_id+"---"+p_name+"---"+p_price+"-yyy--");
  categoryModel c =category.getproduct(p_cat);
  //  c.toString();
   supplierModel s=supplier.getproduct((p_sc));
    //s.toString();
  
    productModel p= new productModel();
    p.setId(p_id);
    p.setPname(p_name);
    p.setPrice(p_price);
    p.setCategory(c);
    p.setSupplier(s);
    System.out.println(p_id+"---"+p_name+"---"+p_price+"-rrr--");
          
    pdao.updateData(p);
    System.out.println(p_id+"---"+p_name+"---"+p_price+"---eee");
    ModelAndView mv = new ModelAndView("productList");
    List<productModel> list=pdao.listData();
    mv.addObject("slist", list);
    return mv;  
	} 
}



