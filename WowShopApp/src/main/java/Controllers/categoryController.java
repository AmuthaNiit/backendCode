package Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.categoryDao;
import ShopID.Dao.supplierDao;
import ShopID.Model.categoryModel;
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
	}


