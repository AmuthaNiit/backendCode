package Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.supplierDao;
import ShopID.Model.supplierModel;

@Controller
@Transactional
public class supplierController {
	
	 @Autowired
	 supplierDao suppliers;
	 	 public void supplierDao(supplierDao supplierss)
	 {
		 this.suppliers=supplierss;
	 }
	 
	 @RequestMapping(value ="/admin/supplier")
	    public ModelAndView persist(HttpServletRequest request)
	    {
	        
		 int s_id=Integer.valueOf(request.getParameter("s_id"));
			String s_name=request.getParameter("s_name");
			System.out.println(s_id+"---"+s_name);
			suppliers.persist(new supplierModel(s_id, s_name));
			ModelAndView ss = new ModelAndView("adding");
			return ss;
	    }
	

}
