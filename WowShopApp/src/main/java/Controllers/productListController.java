package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.productDao;
import ShopID.Model.productModel;

@Controller
public class productListController {
	 @Autowired
	 productDao products;
	@RequestMapping(value ="/productList")
    public ModelAndView listData() 
   {
		ModelAndView mv=new ModelAndView("productList"); 
		List<productModel> slist=products.listData();
		mv.addObject("slist", slist);
	    return mv;
	

   }
}
