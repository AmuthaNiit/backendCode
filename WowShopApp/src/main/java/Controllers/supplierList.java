package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class supplierList {
	
	@RequestMapping(value ="/supplierList")
    public ModelAndView add() {
        
     ModelAndView c1 = new ModelAndView("supplierList");
        return c1;

}
}