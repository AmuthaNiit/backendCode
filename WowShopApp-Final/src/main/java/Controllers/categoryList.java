package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.categoryDao;
import ShopID.Dao.productDao;
import ShopID.Model.categoryModel;
import ShopID.Model.productModel;

@Controller
public class categoryList {
	@Autowired
	 categoryDao category;
	@RequestMapping(value ="admin/categoryList")
   public ModelAndView listData() 
  {
		ModelAndView mv=new ModelAndView("categoryList"); 
		List<categoryModel> slist= category.listData();
		mv.addObject("slist", slist);
	    return mv;
	

  }

}
