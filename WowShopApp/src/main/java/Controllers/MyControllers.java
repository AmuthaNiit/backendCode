package Controllers;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.productDao;
import ShopID.DaoImplementation.productDaoImpl;
import ShopID.Model.productModel;

	

	@Controller
	public class MyControllers

	{
		
		@RequestMapping("/")
		public String index()
		{
			return "index";
		}

		@RequestMapping("/signup")
		public String signup()
		{
			return "signup";
		}

		@RequestMapping("/login")
		public String login()
		{
			return "login";
		}
		@RequestMapping("/productDetails")
		public String productDetails()
		{
			return "productDetails";
		}
		
		
		/*@RequestMapping("/productTable")
		public ModelAndView productTable()
		{
			shopDao cart= new DaoImplementation();
			cart.addData(new shopModel("111","Kalsetra","Saree", "Handloom Saree",2000,20, "Ethinic","palmSilks"));
			ModelAndView mv= new ModelAndView("productTable");
			mv.addObject("productlist",cart);
			return mv;
		}*/
		
		@RequestMapping("/productTable")
		public ModelAndView productTable() 
		{
			
			  productDao pr=new productDaoImpl();
			//  pr.persist(new Model("101","Bandhini","BlackGray","sarees",2750,1,"Women Wear","Supplier"));
			 					//return back to index.jsp
					ModelAndView model = new ModelAndView("productTable");
					model.addObject("prodD", pr);

					return model;
				}
		


	}

	


