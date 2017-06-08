  package Controllers;


	import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.categoryDao;
import ShopID.Dao.productDao;
import ShopID.DaoImplementation.productDaoImpl;
import ShopID.Model.categoryModel;
import ShopID.Model.productModel;

	

	@Controller
	public class MyControllers

	{
		
		@Autowired
		categoryDao cat;
		
		@Autowired
		productDao pDao;
		
		 
		
		@RequestMapping("/")
		public ModelAndView index()
		{
			
			ModelAndView mv = new ModelAndView("index");
			List<categoryModel> c= cat.listData();
			mv.addObject("catlist",c);
			return mv;			
		} 
		
		
		  @RequestMapping("/productFilter")
			public ModelAndView productListFilter(HttpServletRequest request)
			{ 
				List<productModel> clist=pDao.getFilterProducts(Integer.valueOf(request.getParameter("id")));
				List<productModel> list=pDao.listData();
				ModelAndView mv = new ModelAndView("productFilter");	
				mv.addObject("catlist",clist);
				return mv;
			}
		  
		  @RequestMapping("/productview")
		    public ModelAndView listData() 
		   {
				ModelAndView mv=new ModelAndView("productview"); 
				List<productModel> slist=pDao.listData();
				mv.addObject("slist", slist);
			    return mv;
			

		   }
		  
		  @RequestMapping("/product")
			public ModelAndView product(HttpServletRequest request) 
			{
				
		        String id=request.getParameter("id");
		        productModel p=pDao.getproduct(id);
				ModelAndView mv = new ModelAndView("productDetail");
				/*List<categoryModel> c= cat.listData();
				mv.addObject("catalist",c);*/
				mv.addObject("product", p);
				
				return mv;
			}


		
		@ModelAttribute
		public void addattributes(Model model)
		{
			model.addAttribute("catlist",cat.listData());
		}
		

		/*@RequestMapping("/signup")
		public String signup()
		{
			return "signup";
		}*/

		/*@RequestMapping("/login")
		public String login()
		{
			return "login";
		}*/
		
		@RequestMapping("/productDetails")
		public String productDetails()
		{
			return "productDetails";
		}
		
		@RequestMapping("/login")
		public ModelAndView login(HttpServletRequest request1) {
			ModelAndView mv = new ModelAndView("login");
			return mv;
		}
		
	/*	@RequestMapping("/userlogged")
		public ModelAndView userLogged() { 
			ModelAndView mv = new ModelAndView("/");
			
			return mv;
		}*/
		@RequestMapping("/userlogged")
		public String userLogged() { 
			return "redirect:/";	
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

	


