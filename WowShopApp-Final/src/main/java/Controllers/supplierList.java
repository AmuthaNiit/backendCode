package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.supplierDao;
import ShopID.Model.supplierModel;

@Controller
public class supplierList {
	
	/* @RequestMapping(value ="/admin/supplierList")
    public ModelAndView add() {
        
     ModelAndView c1 = new ModelAndView("supplierList");
        return c1;*/
	 @Autowired
	 supplierDao supply;
	@RequestMapping(value ="/admin/supplierList")
   public ModelAndView listData() 
  {
		ModelAndView mv=new ModelAndView("supplierList"); 
		List<supplierModel> slist=supply.listData();
		mv.addObject("slist", slist);
	    return mv;
	

  }


}
