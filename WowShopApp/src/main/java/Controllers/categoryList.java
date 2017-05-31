package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class categoryList {
	@RequestMapping(value ="/categoryList")
    public ModelAndView add() {
        
	 ModelAndView c1=new ModelAndView("categoryList");
		return c1;
    }

}
