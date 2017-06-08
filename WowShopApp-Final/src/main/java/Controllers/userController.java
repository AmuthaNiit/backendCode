package Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.UserDao;
import ShopID.Model.userModel;

@Controller
public class userController {
	
	 @Autowired
	 UserDao user1;
	
	 public void UserDao(UserDao user)
	 {
		 this.user1=user;
	 }
	 
	
	
	@RequestMapping(value="signup")
  	public ModelAndView regpage()
  	{
  		ModelAndView m2=new ModelAndView("signup");
  		return m2;
  		
  	}

	@RequestMapping(value ="/reg",method=RequestMethod.POST)
	   
	public ModelAndView regi(HttpServletRequest request)
	   {
		System.out.println("Inside Controller");
		   
		    String u_mail=request.getParameter("mail");
			
		 			
		  // int u_id=Integer.parseInt(request.getParameter("userid"));
		   
		   String u_name=request.getParameter("name");
		   
		   String u_pass=request.getParameter("pwd");
		   
		   String u_addr=request.getParameter("address");
		   
		   
		   
		   int u_age=Integer.valueOf(request.getParameter("age"));
		   
		   //int u_age=Integer.parseInt(request.getParameter("userage"));
		   
		   String u_city=request.getParameter("city");
		   String u_phone=request.getParameter("phno");
		   
		   //int u_phone=Integer.valueOf(request.getParameter("userphone"));
		   
		  // int u_phone=Integer.parseInt(request.getParameter("userphone"));
		   
		
		   
		   
		   userModel u =new userModel();
		   u.setUsermail(u_mail);
		   u.setAddress(u_addr);
		   u.setAge(u_age);
		   u.setCity(u_city);
		   u.setPhonenumber(u_phone);
		   u.setPwd(u_pass);
		   u.setUserName(u_name);
		   u.setRole("USER");
		   
		   
			//System.out.println(u.getUserid());
			user1.persist(u);
			
			ModelAndView mv = new ModelAndView("index");
			return mv;
	   }

}
